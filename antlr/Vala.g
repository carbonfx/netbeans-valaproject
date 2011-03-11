grammar Vala;

options {
    backtrack=true;
    memoize=true;
    output=AST;
    ASTLabelType=CommonTree;     
}

tokens { UNKNOWN_CHAIN; }

@header { package org.carbonfx.valaproject.antlr; }
@lexer::header { package org.carbonfx.valaproject.antlr; }
	
@members {
	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();
	private java.util.regex.Pattern msgPattern = java.util.regex.Pattern.compile(".*missing KW_([A-Z]*) at (.*)");

	@Override
	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String message = super.getErrorMessage(e, tokenNames);
		SyntaxError syntaxError = new SyntaxError();
		syntaxError.exception = e;
		
		java.util.regex.Matcher m = msgPattern.matcher(message);
		if (m.matches()) {
			message = "'"+m.group(1).toLowerCase() + "' expected at " + m.group(2);
		}
		
		syntaxError.message = message;
		syntaxErrors.add(syntaxError);
		return message;
	}

	public static class SyntaxError {
		public RecognitionException exception;
		public String message;
		public int line;
		public int charPositionInLine;
	}
}

compilation_unit 
	: 
	(using_directive)*
	(namespace_member)*;

using_directive 
	: 
	KW_USING
	symbol	
	(
		COMMA 
		symbol
	)* 
	SEMICOLON;

symbol
	: 
	symbol_part 
	(
		DOT
		symbol_part
	)*;

symbol_part 
	: 
	( GLOBAL_NS IDENTIFIER ) 
	| IDENTIFIER;

namespace_member
	: 
	(attributes)?
	( namespace_declaration
	| class_declaration 
	| interface_declaration 
	| struct_declaration 
	| enum_declaration 
	| errordomain_declaration 
	| method_declaration 
	| delegate_declaration 
	| constant_declaration	
	| field_declaration );

attributes
	: (attribute
	)+;

attribute 
	: 
	LBRACKET
	identifier
	(attribute_arguments)?
	RBRACKET;

attribute_arguments
	:
	LPAREN 
	(attribute_argument (COMMA attribute_argument)*)?
	RPAREN;

attribute_argument
	: identifier ASSIGNMENT expression;

expression
	:
	lambda_expression
	|
	( conditional_expression (assignment_operator expression)? );

assignment_operator 
	: ASSIGNMENT | INCR_ASSIGN | DECR_ASSIGN | OR_ASSIGN | AND_ASSIGN | XOR_ASSIGN | DIV_ASSIGN | MUL_ASSIGN | MOD_ASSIGN | SHL_ASSIGN | SHR_ASSIGN;

conditional_expression 
	: 
	coalescing_expression 
	(QUESTION expression COLON expression)?;

coalescing_expression 
	: 
	conditional_or_expression 
	(COALESCE coalescing_expression)?;

conditional_or_expression 
	: 
	conditional_and_expression 
	(BOOL_OR conditional_and_expression)*;

conditional_and_expression 
	: 
	in_expression 
	(BOOL_AND in_expression)*;

in_expression 
	: 
	inclusive_or_expression 
	(KW_IN inclusive_or_expression)?;

inclusive_or_expression 
	: 
	exclusive_or_expression 
	(OR exclusive_or_expression)*;

exclusive_or_expression 
	: 
	and_expression 
	(XOR and_expression)?;

and_expression 
	: 
	equality_expression 
	(AND equality_expression)*;

equality_expression 
	: 
	relational_expression 
	(( EQUAL | NOT_EQUAL ) relational_expression)*;

relational_expression 
	: 
	shift_expression 
	( 
			(( LT | GT | LTEQ | GTEQ ) shift_expression ) 
		| 
			( KW_IS type ) 
		| 
			( KW_AS type ) 
	)*;

type 
	: 
	( 
		KW_VOID
		(MULTIPLY)* 
	) 
	| 
	( 
		(KW_DYNAMIC)? 
		(KW_OWNED | KW_UNOWNED | KW_WEAK)? 
		symbol 
		(type_arguments)? 
		(MULTIPLY)* 
		(QUESTION)? 
		(array_type)* 
	);

array_type 
	: 
	LBRACKET 
	(array_size)?
	RBRACKET  
	(QUESTION)?;

shift_expression 
	: 
	additive_expression 
	(
		( SHIFT_LEFT | shift_right ) additive_expression
	)*;

shift_right
	:
	GT GT;

additive_expression 
	: 
	multiplicative_expression 
	(
		( PLUS | MINUS ) multiplicative_expression
	)*;

multiplicative_expression 
	: 
	unary_expression 
	(
		( 
		(MULTIPLY)
		| (DIV)
		| (MOD)
		) unary_expression
	)*;

unary_expression 
	: 
		( unary_operator unary_expression ) 
	| 	
		primary_expression;

unary_operator 
	: 
	PLUS 
	| MINUS 
	| NOT 
	| BITWISE_NOT 
	| INCREMENT
	| DECREMENT
	| MULTIPLY 
	| AND 
	| cast_operator
	| LPAREN NOT RPAREN;

cast_operator
	:
	LPAREN type RPAREN
	| LPAREN KW_UNOWNED RPAREN
	| LPAREN KW_OWNED RPAREN
	| LPAREN KW_WEAK RPAREN;

primary_expression 
	: 
	( 
		literal
		| initializer
		| tuple
		| template
		| this_access
		| base_access
		| object_or_array_creation_expression
		| yield_expression
		| sizeof_expression
		| typeof_expression
		| simple_name
	)
	(
		member_access
		| pointer_member_access
		| method_call
		| element_access
		| post_increment_expression
		| post_decrement_expression
	)*;

member_access
	: 
	DOT
	identifier
	(type_arguments)?;
	
identifier
	:
	IDENTIFIER
	| KW_USING
	| KW_CONSTRUCT
	| KW_SET
	| KW_GET
	| KW_IN
	| KW_IS
	| KW_AS
	| KW_VOID	
	| KW_DYNAMIC	
	| KW_OWNED
	| KW_WEAK
	| KW_UNOWNED
	| KW_TRUE
	| KW_FALSE		
	| KW_NULL
	| KW_NEW
	| KW_YIELD
	| KW_SIZEOF
	| KW_TYPEOF
	| KW_ASYNC	
	| KW_CLASS
	| KW_STRUCT
	| KW_EXTERN
	| KW_INLINE
	| KW_STATIC
	| KW_ABSTRACT
	| KW_VIRTUAL
	| KW_OVERRIDE
	| KW_PRIVATE
	| KW_PROTECTED
	| KW_PUBLIC
	| KW_INTERNAL
	| KW_ENUM
	| KW_ERRORDOMAIN
	| KW_INTERFACE
	| KW_NAMESPACE
	| KW_OUT
	| KW_REF
	| KW_PARAMS
	| KW_TRY
	| KW_CATCH
	| KW_FINALLY
	| KW_LOCK
	| KW_DELETE
	| KW_FOREACH
	| KW_CONTINUE
	| KW_RETURN
	| KW_BREAK
	| KW_VAR
	| KW_THROW
	| KW_SIGNAL
	| KW_REQUIRES;
	
post_increment_expression
	: INCREMENT;

post_decrement_expression
	: DECREMENT;

element_access
	: 
	LBRACKET 
	expression
	(slice_array)?
	RBRACKET;
	
slice_array
	:
	COLON 
	expression;
	
pointer_member_access
	: 
	POINTER_ACCESS 
	identifier
	(type_arguments)?;

literal
	: 
	boolean_literal 
	| null_literal 
	| open_regex_literal 
	| vertbatim_string_literal 
	| integer_literal
	| hex_literal 
	| real_literal
	| char_literal
	| string_literal;
	/* TODO: template_string_literal*/
	
integer_literal
	: 
	INTEGER;
	
real_literal
	:	
	REAL;
	
string_literal
	:
	STRING;
	
hex_literal
	:	
	HEX;

boolean_literal
	: KW_TRUE | KW_FALSE;

null_literal
	: KW_NULL;
	
char_literal
	:	
	CHAR;
	
open_regex_literal
	:
	REGEX_LITERAL;	

vertbatim_string_literal
	:
	VERBATIM_LITERAL;

initializer 
	: 
	LCURL 
		(argument 
		(COMMA argument)*)?
	RCURL;

arguments 
	: 
	argument 
	(COMMA argument)*;

argument 
	:
	(
		identifier
		COLON
	)? 
	((KW_REF) | (KW_OUT))?
	expression;

tuple 
	: 
	LPAREN 
	expression 
	(
		COMMA 
		expression
	)* 
	RPAREN;

template
	: 
	TEMPLATE_START
	(expression COMMA)*
	QUOT;
	
this_access 
	: KW_THIS;

base_access 
	: KW_BASE;

object_or_array_creation_expression 
	: 
	KW_NEW 
	member 
	( object_creation_expression | array_creation_expression );

object_creation_expression 
	: 
	LPAREN  
	( arguments )? 
	RPAREN  
	( object_initializer )?;

object_initializer 
	: 
	LCURL 
	member_initializer 
	(
		COMMA
		member_initializer
	)? 
	RCURL;

member_initializer 
	: identifier ASSIGNMENT expression;

array_creation_expression 
	: 
	(
		LBRACKET  
		RBRACKET
	)* 
	(
		LBRACKET  
		(array_size)? 
		RBRACKET
	)? 
	(initializer)?;

array_size 
	: 
	expression 
	(COMMA expression)*;

member 
	: 
	( 	
		GLOBAL_NS identifier 
		| identifier 
	) 
	(type_arguments)? 
	(member_access)*;

type_arguments 
	:
	LT 
	type
	(COMMA type)* 
	GT;

yield_expression 
	: KW_YIELD (base_access DOT)? member method_call;

method_call 
	: 
	LPAREN  
	(arguments)? 
	RPAREN  
	(object_initializer)?;

sizeof_expression 
	: 
	KW_SIZEOF
	LPAREN 
	type 
	RPAREN;

typeof_expression 
	: KW_TYPEOF LPAREN type RPAREN;

simple_name 
	: ( GLOBAL_NS identifier | identifier ) (type_arguments)?;

lambda_expression 
	: lambda_expression_params LAMBDA lambda_expression_body;

lambda_expression_params 
	: 
	identifier 
	|
	( 
		LPAREN  
		(identifier (COMMA identifier)* )? 
		RPAREN 
	);

lambda_expression_body 
	: expression | block;

member_declaration_modifiers 
	: member_declaration_modifier+;
	
member_declaration_modifier 
	: 
	KW_ASYNC
	| KW_CLASS
	| KW_EXTERN
	| KW_INLINE
	| KW_STATIC
	| KW_ABSTRACT
	| KW_VIRTUAL
	| KW_OVERRIDE
	| KW_NEW;

constructor_declaration 
	: 
	(constructor_declaration_modifiers)? 
	KW_CONSTRUCT
	block;

constructor_declaration_modifiers 
	: 
	constructor_declaration_modifier+;
	
constructor_declaration_modifier 
	: 
	KW_ASYNC
	 | KW_CLASS
	 | KW_EXTERN
	 | KW_INLINE
	 | KW_STATIC
	 | KW_ABSTRACT
	 | KW_VIRTUAL
	 | KW_OVERRIDE;

destructor_declaration 
	:
	 (constructor_declaration_modifiers)? 
	 BITWISE_NOT
	 IDENTIFIER
	 LPAREN  
	 RPAREN 
	 block;

class_declaration 
	: 
	(access_modifier)? 
	(type_declaration_modifiers)? 
	KW_CLASS
	symbol 
	(type_arguments)?
	(COLON base_types)? 
	LCURL 
	(class_member)*
	RCURL;

base_types 
	: 
	type 
	(COMMA type)*;

class_member 
	: 
	(attributes)?
	( class_declaration 
	| struct_declaration 
	| enum_declaration 
	| delegate_declaration 
	| method_declaration 
	| signal_declaration 
	| field_declaration 
	| constant_declaration 
	| property_declaration 
	| constructor_declaration 
	| creation_method_declaration
	| destructor_declaration 
	| unknown_chain);

access_modifier 
	: 
	KW_PRIVATE
	| KW_PROTECTED
	| KW_INTERNAL
	| KW_PUBLIC;

type_declaration_modifiers 
	: type_declaration_modifier+;

type_declaration_modifier 
	: 
	KW_ABSTRACT
	| KW_EXTERN
	| KW_STATIC;

enum_declaration 
	: 
	(access_modifier)? 
	(type_declaration_modifiers)? 
	KW_ENUM
	symbol
	LCURL 
	(enum_member)* 
	RCURL;

enum_member
	:
	(
		(attributes)?
		(
			method_declaration 
			| constant_declaration 
			| unknown_chain
		)
	)
	|
	(enum_values);

enum_values 
	: 
	enum_value 
	(COMMA enum_value)*
	(COMMA)?
	(SEMICOLON)?;
	
enum_value 
	: 
	(attributes)? 
	identifier
	(ASSIGNMENT expression)?;

errordomain_declaration 
	: 
	(access_modifier)? 
	(type_declaration_modifiers)? 
	KW_ERRORDOMAIN
	symbol
	LCURL 
	errorcodes 
	(SEMICOLON  (method_declaration)*)? 
	RCURL;

errorcodes 
	: 
	errorcode 
	(COMMA errorcode)*
	(COMMA)?;
	
errorcode 
	: (attributes)? IDENTIFIER (ASSIGNMENT expression)?;

interface_declaration 
	: 
	(access_modifier)? 
	(type_declaration_modifiers)? 
	KW_INTERFACE
	symbol 
	(type_parameters)?
	(COLON base_types)? 
	LCURL 
	(interface_member)*
	RCURL;

type_parameters 
	: 
	LT 
	identifier
	(COMMA identifier)* 
	GT;

interface_member 
	: (attributes)?
	( 
	class_declaration
	| struct_declaration 
	| enum_declaration 
	| delegate_declaration 
	| method_declaration 
	| signal_declaration 
	| field_declaration 
	| constant_declaration 
	| property_declaration );

namespace_declaration 
	: 
	KW_NAMESPACE
	symbol 
	LCURL  
	(using_directive)* 
	(namespace_member)* 
	RCURL;

struct_declaration 
	: 
	(access_modifier)? 
	(type_declaration_modifiers)? 
	KW_STRUCT
	symbol
        (COLON base_types)? 
        LCURL 
        (struct_member)* 
        RCURL;

struct_member 
	: 
	(attributes)? 
	( 
		method_declaration 
		| field_declaration 
		| constant_declaration 
		| property_declaration
		| creation_method_declaration
		| unknown_chain
	);

creation_method_declaration 
	: 
	(access_modifier)? 
	(constructor_declaration_modifiers)? 
	symbol 
	parameters 
	(throws_part)? 
	(requires_decl)? 
	(ensures_decl)? 
	(SEMICOLON | block);

throws_part
	: 
	KW_THROWS
	type 
	(COMMA type)*;

parameters 
	: 
	LPAREN 
	(parameters_decl)?
	RPAREN;

parameters_decl
	:
	parameter
	(COMMA parameter)*;
		


requires_decl 
	: 
	KW_REQUIRES
	LPAREN 
	expression 
	RPAREN
	(requires_decl)?;
	
parameter 
	: 
	(attributes)? 
	( 	
		ELIPSIS 
		| 
		( 
			(KW_PARAMS)?
			((KW_OWNED) | (KW_UNOWNED))?
			((KW_REF) | (KW_OUT))?
			type 
			identifier 
			(ASSIGNMENT expression)? 
		) 
	);

ensures_decl 
	: 
	KW_ENSURES  
	LPAREN 
	expression 
	RPAREN  
	(ensures_decl)?;

delegate_declaration 
	: 
	(access_modifier)? 
	(delegate_declaration_modifiers)? 
	KW_DELEGATE
	type 
	symbol 
	(type_parameters)?
	parameters
	(throws_part)? 
	SEMICOLON;

delegate_declaration_modifiers 
	: delegate_declaration_modifier+;
	
delegate_declaration_modifier 
	: 
	KW_ASYNC
	| KW_CLASS
	| KW_EXTERN
	| KW_INLINE 
	| KW_ABSTRACT 
	| KW_VIRTUAL 
	| KW_OVERRIDE
	| KW_STATIC;

signal_declaration 
	: 
	(access_modifier)? 
	(signal_declaration_modifiers)? 
	KW_SIGNAL
	type 
	IDENTIFIER
	parameters
	( SEMICOLON | block );

signal_declaration_modifiers 
	: signal_declaration_modifier+;
	
signal_declaration_modifier 
	:
	KW_ASYNC
	| KW_EXTERN
	| KW_INLINE
	| KW_ABSTRACT
	| KW_VIRTUAL
	| KW_OVERRIDE
	| KW_NEW;

method_declaration 
	: 
	(access_modifier)? 
	(member_declaration_modifiers)? 
	type 
	identifier 
	(type_parameters)?        
	parameters
	(throws_part)? 
	(requires_decl)? 
	(ensures_decl)? 
	( SEMICOLON | block );

constant_declaration 
	: 
	(access_modifier)? 
	(member_declaration_modifiers)? 
	KW_CONST
	type 
	IDENTIFIER 
	(inline_array_type)?
	(ASSIGNMENT expression)? 
	SEMICOLON;

inline_array_type 
	: 
	LBRACKET
	INTEGER 
	RBRACKET;

field_declaration 
	: 
	(access_modifier)? 
	(member_declaration_modifiers)? 
	type 
	identifier
	(LBRACKET  RBRACKET)?
	(ASSIGNMENT expression)? 
	SEMICOLON;

property_declaration 
	: 
	(access_modifier)? 
	(property_declaration_modifiers)? 
	type identifier
        LCURL 
        (property_declaration_part)* 
        RCURL;

property_declaration_part 
	: 
	( 
		KW_DEFAULT
		ASSIGNMENT 
		expression 
		SEMICOLON 
	) 
	| property_accessor;

property_accessor 
	: 
	(attributes)? 
	(access_modifier)?
	(KW_OWNED | KW_UNOWNED)?
	(
		(property_get_accessor property_set_construct_accessor)
		| (property_set_construct_accessor property_get_accessor)
		| (property_set_construct_accessor)		
		| (property_get_accessor)		
	);

property_get_accessor 
	: 	
	(access_modifier)?
	KW_GET
	( SEMICOLON | block );

property_set_construct_accessor 
	: 
	(
		(access_modifier)?
		(
			( KW_SET (KW_CONSTRUCT)? ) 
			| ( KW_CONSTRUCT )
			| ( KW_CONSTRUCT KW_SET )
		)
	)
	( 
		SEMICOLON 
		| block 
	);

property_declaration_modifiers 
	: property_declaration_modifier+;
	
property_declaration_modifier 
	: 
	KW_CLASS
	| KW_STATIC
	| KW_EXTERN
	| KW_INLINE
	| KW_ABSTRACT
	| KW_VIRTUAL
	| KW_OVERRIDE
	| KW_NEW;

block 
	: 
	LCURL 
	(statement)* 
	RCURL;

statement 
	: 
	block 
	| SEMICOLON 
	| if_statement 
	| switch_statement 
	| while_statement
	| do_statement
	| for_statement 
	| foreach_statement 
	| break_statement 
	| continue_statement 
	| return_statement 
	| yield_statement 
	| throw_statement 
	| try_statement 
	| lock_statement 
	| delete_statement 
	| local_variable_declarations 
	| expression_statement;

if_statement 
	: 
	KW_IF
	LPAREN 
	expression 
	RPAREN 
	embedded_statement 
	(
		KW_ELSE
		embedded_statement
	)?;

embedded_statement 
	: 
	block 
	| embedded_statement_without_block;

embedded_statement_without_block 
	: 
	SEMICOLON 
	| if_statement 
	| switch_statement 
	| while_statement 
	| do_statement
	| for_statement 
	| foreach_statement 
	| break_statement 
	| continue_statement 
	| return_statement 
	| yield_statement 
	| throw_statement 
	| try_statement 
	| lock_statement 
	| delete_statement 
	| expression_statement;

switch_statement 
	: 
	KW_SWITCH
	LPAREN 
	expression 
	RPAREN  
	LCURL 
	(switch_section)* 
	RCURL;

switch_section 
	: 
	(
		( KW_CASE expression )
		| ( KW_DEFAULT ) 
	)
	COLON
	(statement)*
	(KW_BREAK)?;

while_statement 
	: KW_WHILE  LPAREN expression RPAREN embedded_statement;

do_statement 
	: KW_DO embedded_statement KW_WHILE LPAREN expression RPAREN  SEMICOLON;
	
for_statement 
	: 
	KW_FOR
	LPAREN  
	(
		SEMICOLON
		| (for_initializer)
	)
	(expression)? 
	SEMICOLON  
	(for_iterator)? 
	RPAREN  
	embedded_statement;

for_initializer 
	: local_variable_declarations
	| 
	( 
		statement_expression 
		(COMMA statement_expression)* 
		SEMICOLON
	);

for_iterator 
	: 
	statement_expression 
	(COMMA statement_expression)*;

statement_expression 
	: expression;

foreach_statement 
	: 
	KW_FOREACH
	LPAREN
	(
		type
		| KW_VAR
	)
	IDENTIFIER 
	KW_IN
	expression 
	RPAREN 
	embedded_statement;

break_statement 
	: KW_BREAK  SEMICOLON;

continue_statement 
	: KW_CONTINUE  SEMICOLON;

return_statement 
	: KW_RETURN  (expression
	)? SEMICOLON;

yield_statement 
	: KW_YIELD  (expression_statement | KW_RETURN expression
	)? SEMICOLON;

throw_statement 
	: KW_THROW expression SEMICOLON;

try_statement 
	: 
	KW_TRY 
	block 
	(catch_clause)*
	(finally_clause)?;

catch_clause 
	: KW_CATCH  (LPAREN type IDENTIFIER RPAREN)? block;

finally_clause 
	: 
	KW_FINALLY 
	block;

lock_statement 
	: KW_LOCK  LPAREN expression RPAREN embedded_statement;

delete_statement 
	: KW_DELETE expression SEMICOLON;

local_variable_declarations 
	: 
	( KW_VAR | type ) 
	local_variable_declaration 
	(COMMA local_variable_declaration)*
	(SEMICOLON);

local_variable_declaration 
	: 
	local_tuple_declaration 
	| local_variable;

local_tuple_declaration 
	: 
	LPAREN
	IDENTIFIER 
	(COMMA IDENTIFIER)* 
	RPAREN  
	ASSIGNMENT 
	expression;

local_variable 
	: 
	identifier 
	(inline_array_type)? 
	(ASSIGNMENT expression)?;

expression_statement 
	: 
	statement_expression SEMICOLON;
	
unknown_chain
	:
	(identifier)+
	SEMICOLON
		-> ^(UNKNOWN_CHAIN (identifier)+);

/********************************************************************************************
                  Lexer section
*********************************************************************************************/

WHITESPACE : 
	(' '
	| '\t' 
	| '\r' 
	| '\n'
	| '\u000C'
	) { $channel=HIDDEN; };


COMMENT_JAVADOC: ;

COMMENT
    :   '/*'
    	(
    		{input.LA(1) == '*'}?=>
    		('*'{ $type = COMMENT_JAVADOC; })
    		| { $type = COMMENT; }
    	)
	(options {greedy=false;} : .)*
        '*/'
        { $channel=HIDDEN; };


LINE_COMMENT
    	:
    	(
	    	'//' 
    		~('\n' | '\r')* 
		('\r\n' | '\r' | '\n') 
    	|   
    		'//' ~('\n' | '\r')*     // a line comment could appear at the end of the file without CR/LF
    	)
    	{ $channel=HIDDEN; }
    	;    

KW_USING
	: 'using';
	
KW_CONSTRUCT
	: 'construct';
	
KW_SET
	: 'set';

KW_GET
	: 'get';
	
KW_IN
	: 'in';
	
KW_IS
	: 'is';
	
KW_AS
	: 'as';
	
KW_VOID	
	: 'void';
	
KW_DYNAMIC	
	: 'dynamic';
	
KW_OWNED
	: 'owned';
	
KW_WEAK
	: 'weak';
	
KW_UNOWNED
	: 'unowned';
	
KW_TRUE
	: 'true';
	
KW_FALSE		
	: 'false';
	
KW_NULL	
	: 'null';
	
KW_NEW
	: 'new';
	
KW_YIELD
	: 'yield';
	
KW_SIZEOF
	: 'sizeof';
	
KW_TYPEOF
	: 'typeof';
	
KW_ASYNC	
	: 'async';
	
KW_CLASS
	: 'class';
	
KW_STRUCT
	: 'struct';
	
KW_EXTERN
	: 'extern';
	
KW_INLINE
	: 'inline';
	
KW_STATIC
	: 'static';
	
KW_ABSTRACT
	: 'abstract';
	
KW_VIRTUAL
	: 'virtual';
	
KW_OVERRIDE
	: 'override';
	
KW_PRIVATE
	: 'private';
	
KW_PROTECTED
	: 'protected';
	
KW_PUBLIC
	: 'public';
	
KW_INTERNAL
	: 'internal';
	
KW_ENUM
	: 'enum';
	
KW_ERRORDOMAIN
	: 'errordomain';
	
KW_INTERFACE
	: 'interface';
	
KW_NAMESPACE
	: 'namespace';
		
KW_OUT
	: 'out';
	
KW_REF
	: 'ref';
	
KW_PARAMS
	: 'params';

KW_TRY
	: 'try';
	
KW_CATCH
	: 'catch';
	
KW_FINALLY
	: 'finally';
	
KW_LOCK
	: 'lock';

KW_DELETE
	: 'delete';
	
KW_FOREACH
	: 'foreach';	

KW_CONTINUE
	: 'continue';

KW_RETURN
	: 'return';

KW_BREAK
	: 'break';

KW_VAR
	: 'var';
	
KW_THROW
	: 'throw';

KW_THIS
	: 'this';
	
KW_BASE
	: 'base';
	
KW_THROWS
	: 'throws';

KW_REQUIRES
	: 'requires';

KW_ENSURES
	: 'ensures';

KW_DELEGATE
	: 'delegate';

KW_SIGNAL
	: 'signal';
	
KW_CONST
	: 'const';

KW_DEFAULT
	: 'default';

KW_IF
	: 'if';
	
KW_ELSE
	: 'else';
	
KW_SWITCH
	: 'switch';
	
KW_CASE
	: 'case';
	
KW_WHILE
	: 'while';
	
KW_DO
	: 'do';

KW_FOR
	: 'for';
	
HEX
	: 
	'0x'
	(HEXDIGIT)+
    ;    
	
IDENTIFIER
	: 
	( '@' ( 'a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ )
	
	|
	
	( 'a'..'z' | 'A'..'Z' | '_' )
	( 'a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
	
	|
	
	('0'..'9')+ 
	(('a'..'z' | 'A'..'Z' | '_'))+ 
	( 'a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
    ;

VERBATIM_LITERAL
	:
	'"""'
	(options {greedy=false;} : .)*
	'"""'
    	;

STRING
	: 
	'"'  
	( 
		ESCAPE 
		| ~(BACKSLASH | QUOT) 
	)* 
	'"'
    	;

SHIFT_LEFT
	:
	'<<';

COMMA
	: ',';

SEMICOLON
	: ';';

LBRACKET
	: '[';

RBRACKET
	: ']';

LPAREN
	: '(';

RPAREN
	: ')';

INCR_ASSIGN
	: '+=';

DECR_ASSIGN
	: '-=';
	
OR_ASSIGN
	: '|=';

AND_ASSIGN
	: '&=';

XOR_ASSIGN
	: '^=';

DIV_ASSIGN
	: '/=';

MUL_ASSIGN
	: '*=';

MOD_ASSIGN
	: '%=';

SHL_ASSIGN
	: '<<=';

fragment
SHR_ASSIGN
	: ; // >>=
	
fragment
GTEQ
	: ; // >=
	
GT
	:	
	'>'
	(
		( 
			{ input.LA(1) == '>' && input.LA(2) == '=' }?=>
			('>=' { $type = SHR_ASSIGN; /*System.out.println("SHR_ASSIGN!");*/ })
		)
		|
		( 
			{ input.LA(1) == '=' }?=>
			('=' { $type = GTEQ; /*System.out.println("GTEQ!");*/ })
		)
		|
		({$type = GT; /*System.out.println("GT!");*/ })
	);
	
QUESTION
	: '?';

COALESCE
	: '??';
	
COLON
	: ':';
	
BOOL_OR
	: '||';
	
BOOL_AND
	: '&&';

OR
	: '|';
	
AND
	: '&';

XOR
	: '^';

EQUAL
	: '==';

NOT_EQUAL
	: '!=';
	
LTEQ
	: '<=';

MULTIPLY
	: '*';

PLUS
	: '+';

MINUS
	: '-';

DIV
	: '/';

MOD
	: '%';

NOT
	: '!';

BITWISE_NOT
	: '~';

INCREMENT
	: '++';

DECREMENT
	: '--';
	
POINTER_ACCESS
	: '->';
	
LCURL
	: '{';

RCURL
	: '}';
	
TEMPLATE_START
	: '@"';
	
QUOT
	: '"';
	
LAMBDA
	: '=>';
	
ELIPSIS
	: '...';

LT	:
	'<' ;

ASSIGNMENT
	:
	'=';
	
fragment INTEGER : ;
fragment RANGE : ;
fragment DOT : '.';

REAL
	:
	DIGITS+
	(
		{
			!((input.LA(2) >= 'a' && input.LA(2) <= 'z')
			|| (input.LA(2) >= 'A' && input.LA(2) <= 'Z'))
		}?=>
		DOT DIGITS? EXPONENT? ('d' | 'D' | 'f' | 'F')?
		(
			{ $type = REAL; }
		)
		|
		(
			EXPONENT
			{ $type = REAL; }
			|
			{ $type = INTEGER; }
		)
	)
	|
		DIGITS
		('d' | 'D' | 'f' | 'F')
		{ $type = REAL; }
	|
	
	DOT
	(
		{
			!((input.LA(-2) >= 'a' && input.LA(-2) <= 'z')
			|| (input.LA(-2) >= 'A' && input.LA(-2) <= 'Z'))
		}?=>
		(
			DIGITS EXPONENT? ('d' | 'D' | 'f' | 'F')?
			{ $type = REAL; }
		)
		|
		DOT
		{ $type = RANGE; }
		|
		{ $type = DOT; }
	)
    ;

fragment
DIGITS
    :   ('0'..'9')+
    ;
    
CHAR
	:  '\''  ( ESCAPE | ~('\'' | BACKSLASH) ) '\''
	;
	
LINE_COMMAND 
	: 
	('#' 
	~('\n'|'\r')* 
	'\r'? 
	'\n')
	{$channel=HIDDEN;}
    	; 
	
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEXDIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESCAPE
    	: BACKSLASH  ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|BACKSLASH)
    	| UNICODE
    	| OCTAL
    	;

fragment
OCTAL
	: BACKSLASH ('0'..'3') ('0'..'7') ('0'..'7')
	| BACKSLASH ('0'..'7') ('0'..'7')
	| BACKSLASH ('0'..'7')
	;

fragment
UNICODE
	    :   BACKSLASH 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
	    ;
	    
GLOBAL_NS
	:
	'global::';
	
BACKSLASH 
	: '\\';
	
UNICODE_CHAR
	: '\u0024' |
	'\u0041'..'\u005a' |
	'\u005f' |
	'\u0061'..'\u007a' |
	'\u00c0'..'\u00d6' |
	'\u00d8'..'\u00f6' |
	'\u00f8'..'\u00ff' |
	'\u0100'..'\u1fff' |
	'\u3040'..'\u318f' |
	'\u3300'..'\u337f' |
	'\u3400'..'\u3d2d' |
	'\u4e00'..'\u9fff' |
	'\uf900'..'\ufaff' |
	'\u0030'..'\u0039' |
	'\u0660'..'\u0669' |
	'\u06f0'..'\u06f9' |
	'\u0966'..'\u096f' |
	'\u09e6'..'\u09ef' |
	'\u0a66'..'\u0a6f' |
	'\u0ae6'..'\u0aef' |
	'\u0b66'..'\u0b6f' |
	'\u0be7'..'\u0bef' |
	'\u0c66'..'\u0c6f' |
	'\u0ce6'..'\u0cef' |
	'\u0d66'..'\u0d6f' |
	'\u0e50'..'\u0e59' |
	'\u0ed0'..'\u0ed9' |
	'\u1040'..'\u1049'
    ;

OTHER_CHAR
	: ~UNICODE_CHAR;
	

// todo: implement regular expressions
REGEX_LITERAL
	:
	'/--this-is-not-complete-yet--'
	{
		input.LA(-1) == '/'
	}?=>
	(~('/')
	| '\\/')+
	'/'
	('g'|'m'|'i')*;

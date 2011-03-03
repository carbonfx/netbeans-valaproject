// $ANTLR 3.3 Nov 30, 2010 12:45:30 c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g 2011-02-26 20:10:42
 package org.carbonfx.valaproject.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ValaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int UNKNOWN_CHAIN=4;
    public static final int KW_USING=5;
    public static final int COMMA=6;
    public static final int SEMICOLON=7;
    public static final int DOT=8;
    public static final int GLOBAL_NS=9;
    public static final int IDENTIFIER=10;
    public static final int LBRACKET=11;
    public static final int RBRACKET=12;
    public static final int LPAREN=13;
    public static final int RPAREN=14;
    public static final int ASSIGNMENT=15;
    public static final int INCR_ASSIGN=16;
    public static final int DECR_ASSIGN=17;
    public static final int OR_ASSIGN=18;
    public static final int AND_ASSIGN=19;
    public static final int XOR_ASSIGN=20;
    public static final int DIV_ASSIGN=21;
    public static final int MUL_ASSIGN=22;
    public static final int MOD_ASSIGN=23;
    public static final int SHL_ASSIGN=24;
    public static final int SHR_ASSIGN=25;
    public static final int QUESTION=26;
    public static final int COLON=27;
    public static final int COALESCE=28;
    public static final int BOOL_OR=29;
    public static final int BOOL_AND=30;
    public static final int KW_IN=31;
    public static final int OR=32;
    public static final int XOR=33;
    public static final int AND=34;
    public static final int EQUAL=35;
    public static final int NOT_EQUAL=36;
    public static final int LT=37;
    public static final int GT=38;
    public static final int LTEQ=39;
    public static final int GTEQ=40;
    public static final int KW_IS=41;
    public static final int KW_AS=42;
    public static final int KW_VOID=43;
    public static final int MULTIPLY=44;
    public static final int KW_DYNAMIC=45;
    public static final int KW_OWNED=46;
    public static final int KW_UNOWNED=47;
    public static final int KW_WEAK=48;
    public static final int SHIFT_LEFT=49;
    public static final int PLUS=50;
    public static final int MINUS=51;
    public static final int DIV=52;
    public static final int MOD=53;
    public static final int NOT=54;
    public static final int BITWISE_NOT=55;
    public static final int INCREMENT=56;
    public static final int DECREMENT=57;
    public static final int KW_CONSTRUCT=58;
    public static final int KW_SET=59;
    public static final int KW_GET=60;
    public static final int KW_TRUE=61;
    public static final int KW_FALSE=62;
    public static final int KW_NULL=63;
    public static final int KW_NEW=64;
    public static final int KW_YIELD=65;
    public static final int KW_SIZEOF=66;
    public static final int KW_TYPEOF=67;
    public static final int KW_ASYNC=68;
    public static final int KW_CLASS=69;
    public static final int KW_STRUCT=70;
    public static final int KW_EXTERN=71;
    public static final int KW_INLINE=72;
    public static final int KW_STATIC=73;
    public static final int KW_ABSTRACT=74;
    public static final int KW_VIRTUAL=75;
    public static final int KW_OVERRIDE=76;
    public static final int KW_PRIVATE=77;
    public static final int KW_PROTECTED=78;
    public static final int KW_PUBLIC=79;
    public static final int KW_INTERNAL=80;
    public static final int KW_ENUM=81;
    public static final int KW_ERRORDOMAIN=82;
    public static final int KW_INTERFACE=83;
    public static final int KW_NAMESPACE=84;
    public static final int KW_OUT=85;
    public static final int KW_REF=86;
    public static final int KW_PARAMS=87;
    public static final int KW_TRY=88;
    public static final int KW_CATCH=89;
    public static final int KW_FINALLY=90;
    public static final int KW_LOCK=91;
    public static final int KW_DELETE=92;
    public static final int KW_FOREACH=93;
    public static final int KW_CONTINUE=94;
    public static final int KW_RETURN=95;
    public static final int KW_BREAK=96;
    public static final int KW_VAR=97;
    public static final int KW_THROW=98;
    public static final int POINTER_ACCESS=99;
    public static final int INTEGER=100;
    public static final int REAL=101;
    public static final int STRING=102;
    public static final int HEX=103;
    public static final int CHAR=104;
    public static final int REGEX_LITERAL=105;
    public static final int VERBATIM_LITERAL=106;
    public static final int LCURL=107;
    public static final int RCURL=108;
    public static final int TEMPLATE_START=109;
    public static final int QUOT=110;
    public static final int KW_THIS=111;
    public static final int KW_BASE=112;
    public static final int LAMBDA=113;
    public static final int KW_THROWS=114;
    public static final int KW_REQUIRES=115;
    public static final int ELIPSIS=116;
    public static final int KW_ENSURES=117;
    public static final int KW_DELEGATE=118;
    public static final int KW_SIGNAL=119;
    public static final int KW_CONST=120;
    public static final int KW_DEFAULT=121;
    public static final int KW_IF=122;
    public static final int KW_ELSE=123;
    public static final int KW_SWITCH=124;
    public static final int KW_CASE=125;
    public static final int KW_WHILE=126;
    public static final int KW_DO=127;
    public static final int KW_FOR=128;
    public static final int WHITESPACE=129;
    public static final int COMMENT_JAVADOC=130;
    public static final int COMMENT=131;
    public static final int LINE_COMMENT=132;
    public static final int HEXDIGIT=133;
    public static final int ESCAPE=134;
    public static final int RANGE=135;
    public static final int DIGITS=136;
    public static final int EXPONENT=137;
    public static final int LINE_COMMAND=138;
    public static final int UNICODE=139;
    public static final int OCTAL=140;

    // delegates
    // delegators

    public ValaLexer() {;} 
    public ValaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ValaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g"; }

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1184:12: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' ) )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1185:2: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "COMMENT_JAVADOC"
    public final void mCOMMENT_JAVADOC() throws RecognitionException {
        try {
            int _type = COMMENT_JAVADOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1193:16: ()
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1193:18: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_JAVADOC"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1196:5: ( '/*' ({...}? => ( '*' ) | ) ( options {greedy=false; } : . )* '*/' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1196:9: '/*' ({...}? => ( '*' ) | ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1197:6: ({...}? => ( '*' ) | )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='*') ) {
                int LA1_1 = input.LA(2);

                if ( ((input.LA(1) == '*')) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1198:7: {...}? => ( '*' )
                    {
                    if ( !((input.LA(1) == '*')) ) {
                        throw new FailedPredicateException(input, "COMMENT", "input.LA(1) == '*'");
                    }
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1199:7: ( '*' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1199:8: '*'
                    {
                    match('*'); 
                     _type = COMMENT_JAVADOC; 

                    }


                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1200:9: 
                    {
                     _type = COMMENT; 

                    }
                    break;

            }

            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1202:2: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1202:29: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1208:6: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* ) )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1209:6: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
            {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1209:6: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1210:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    match("//"); 

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1211:7: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1211:7: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1212:3: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1=='\n') ) {
                            alt4=1;
                        }
                        else {
                            alt4=2;}
                    }
                    else if ( (LA4_0=='\n') ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1212:4: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1212:13: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1212:20: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1214:7: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1214:12: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1214:12: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "KW_USING"
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1220:2: ( 'using' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1220:4: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_USING"

    // $ANTLR start "KW_CONSTRUCT"
    public final void mKW_CONSTRUCT() throws RecognitionException {
        try {
            int _type = KW_CONSTRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1223:2: ( 'construct' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1223:4: 'construct'
            {
            match("construct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CONSTRUCT"

    // $ANTLR start "KW_SET"
    public final void mKW_SET() throws RecognitionException {
        try {
            int _type = KW_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1226:2: ( 'set' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1226:4: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SET"

    // $ANTLR start "KW_GET"
    public final void mKW_GET() throws RecognitionException {
        try {
            int _type = KW_GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1229:2: ( 'get' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1229:4: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_GET"

    // $ANTLR start "KW_IN"
    public final void mKW_IN() throws RecognitionException {
        try {
            int _type = KW_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1232:2: ( 'in' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1232:4: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IN"

    // $ANTLR start "KW_IS"
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1235:2: ( 'is' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1235:4: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IS"

    // $ANTLR start "KW_AS"
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1238:2: ( 'as' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1238:4: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_AS"

    // $ANTLR start "KW_VOID"
    public final void mKW_VOID() throws RecognitionException {
        try {
            int _type = KW_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1241:2: ( 'void' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1241:4: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_VOID"

    // $ANTLR start "KW_DYNAMIC"
    public final void mKW_DYNAMIC() throws RecognitionException {
        try {
            int _type = KW_DYNAMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1244:2: ( 'dynamic' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1244:4: 'dynamic'
            {
            match("dynamic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_DYNAMIC"

    // $ANTLR start "KW_OWNED"
    public final void mKW_OWNED() throws RecognitionException {
        try {
            int _type = KW_OWNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1247:2: ( 'owned' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1247:4: 'owned'
            {
            match("owned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_OWNED"

    // $ANTLR start "KW_WEAK"
    public final void mKW_WEAK() throws RecognitionException {
        try {
            int _type = KW_WEAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1250:2: ( 'weak' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1250:4: 'weak'
            {
            match("weak"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_WEAK"

    // $ANTLR start "KW_UNOWNED"
    public final void mKW_UNOWNED() throws RecognitionException {
        try {
            int _type = KW_UNOWNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1253:2: ( 'unowned' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1253:4: 'unowned'
            {
            match("unowned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_UNOWNED"

    // $ANTLR start "KW_TRUE"
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1256:2: ( 'true' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1256:4: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_TRUE"

    // $ANTLR start "KW_FALSE"
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1259:2: ( 'false' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1259:4: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FALSE"

    // $ANTLR start "KW_NULL"
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1262:2: ( 'null' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1262:4: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_NULL"

    // $ANTLR start "KW_NEW"
    public final void mKW_NEW() throws RecognitionException {
        try {
            int _type = KW_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1265:2: ( 'new' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1265:4: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_NEW"

    // $ANTLR start "KW_YIELD"
    public final void mKW_YIELD() throws RecognitionException {
        try {
            int _type = KW_YIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1268:2: ( 'yield' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1268:4: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_YIELD"

    // $ANTLR start "KW_SIZEOF"
    public final void mKW_SIZEOF() throws RecognitionException {
        try {
            int _type = KW_SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1271:2: ( 'sizeof' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1271:4: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SIZEOF"

    // $ANTLR start "KW_TYPEOF"
    public final void mKW_TYPEOF() throws RecognitionException {
        try {
            int _type = KW_TYPEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1274:2: ( 'typeof' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1274:4: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_TYPEOF"

    // $ANTLR start "KW_ASYNC"
    public final void mKW_ASYNC() throws RecognitionException {
        try {
            int _type = KW_ASYNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1277:2: ( 'async' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1277:4: 'async'
            {
            match("async"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ASYNC"

    // $ANTLR start "KW_CLASS"
    public final void mKW_CLASS() throws RecognitionException {
        try {
            int _type = KW_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1280:2: ( 'class' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1280:4: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CLASS"

    // $ANTLR start "KW_STRUCT"
    public final void mKW_STRUCT() throws RecognitionException {
        try {
            int _type = KW_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1283:2: ( 'struct' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1283:4: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_STRUCT"

    // $ANTLR start "KW_EXTERN"
    public final void mKW_EXTERN() throws RecognitionException {
        try {
            int _type = KW_EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1286:2: ( 'extern' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1286:4: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_EXTERN"

    // $ANTLR start "KW_INLINE"
    public final void mKW_INLINE() throws RecognitionException {
        try {
            int _type = KW_INLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1289:2: ( 'inline' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1289:4: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_INLINE"

    // $ANTLR start "KW_STATIC"
    public final void mKW_STATIC() throws RecognitionException {
        try {
            int _type = KW_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1292:2: ( 'static' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1292:4: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_STATIC"

    // $ANTLR start "KW_ABSTRACT"
    public final void mKW_ABSTRACT() throws RecognitionException {
        try {
            int _type = KW_ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1295:2: ( 'abstract' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1295:4: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ABSTRACT"

    // $ANTLR start "KW_VIRTUAL"
    public final void mKW_VIRTUAL() throws RecognitionException {
        try {
            int _type = KW_VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1298:2: ( 'virtual' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1298:4: 'virtual'
            {
            match("virtual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_VIRTUAL"

    // $ANTLR start "KW_OVERRIDE"
    public final void mKW_OVERRIDE() throws RecognitionException {
        try {
            int _type = KW_OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1301:2: ( 'override' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1301:4: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_OVERRIDE"

    // $ANTLR start "KW_PRIVATE"
    public final void mKW_PRIVATE() throws RecognitionException {
        try {
            int _type = KW_PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1304:2: ( 'private' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1304:4: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_PRIVATE"

    // $ANTLR start "KW_PROTECTED"
    public final void mKW_PROTECTED() throws RecognitionException {
        try {
            int _type = KW_PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1307:2: ( 'protected' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1307:4: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_PROTECTED"

    // $ANTLR start "KW_PUBLIC"
    public final void mKW_PUBLIC() throws RecognitionException {
        try {
            int _type = KW_PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1310:2: ( 'public' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1310:4: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_PUBLIC"

    // $ANTLR start "KW_INTERNAL"
    public final void mKW_INTERNAL() throws RecognitionException {
        try {
            int _type = KW_INTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1313:2: ( 'internal' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1313:4: 'internal'
            {
            match("internal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_INTERNAL"

    // $ANTLR start "KW_ENUM"
    public final void mKW_ENUM() throws RecognitionException {
        try {
            int _type = KW_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1316:2: ( 'enum' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1316:4: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ENUM"

    // $ANTLR start "KW_ERRORDOMAIN"
    public final void mKW_ERRORDOMAIN() throws RecognitionException {
        try {
            int _type = KW_ERRORDOMAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1319:2: ( 'errordomain' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1319:4: 'errordomain'
            {
            match("errordomain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ERRORDOMAIN"

    // $ANTLR start "KW_INTERFACE"
    public final void mKW_INTERFACE() throws RecognitionException {
        try {
            int _type = KW_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1322:2: ( 'interface' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1322:4: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_INTERFACE"

    // $ANTLR start "KW_NAMESPACE"
    public final void mKW_NAMESPACE() throws RecognitionException {
        try {
            int _type = KW_NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1325:2: ( 'namespace' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1325:4: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_NAMESPACE"

    // $ANTLR start "KW_OUT"
    public final void mKW_OUT() throws RecognitionException {
        try {
            int _type = KW_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1328:2: ( 'out' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1328:4: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_OUT"

    // $ANTLR start "KW_REF"
    public final void mKW_REF() throws RecognitionException {
        try {
            int _type = KW_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1331:2: ( 'ref' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1331:4: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_REF"

    // $ANTLR start "KW_PARAMS"
    public final void mKW_PARAMS() throws RecognitionException {
        try {
            int _type = KW_PARAMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1334:2: ( 'params' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1334:4: 'params'
            {
            match("params"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_PARAMS"

    // $ANTLR start "KW_TRY"
    public final void mKW_TRY() throws RecognitionException {
        try {
            int _type = KW_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1337:2: ( 'try' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1337:4: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_TRY"

    // $ANTLR start "KW_CATCH"
    public final void mKW_CATCH() throws RecognitionException {
        try {
            int _type = KW_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1340:2: ( 'catch' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1340:4: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CATCH"

    // $ANTLR start "KW_FINALLY"
    public final void mKW_FINALLY() throws RecognitionException {
        try {
            int _type = KW_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1343:2: ( 'finally' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1343:4: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FINALLY"

    // $ANTLR start "KW_LOCK"
    public final void mKW_LOCK() throws RecognitionException {
        try {
            int _type = KW_LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1346:2: ( 'lock' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1346:4: 'lock'
            {
            match("lock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_LOCK"

    // $ANTLR start "KW_DELETE"
    public final void mKW_DELETE() throws RecognitionException {
        try {
            int _type = KW_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1349:2: ( 'delete' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1349:4: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_DELETE"

    // $ANTLR start "KW_FOREACH"
    public final void mKW_FOREACH() throws RecognitionException {
        try {
            int _type = KW_FOREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1352:2: ( 'foreach' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1352:4: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FOREACH"

    // $ANTLR start "KW_CONTINUE"
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1355:2: ( 'continue' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1355:4: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CONTINUE"

    // $ANTLR start "KW_RETURN"
    public final void mKW_RETURN() throws RecognitionException {
        try {
            int _type = KW_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1358:2: ( 'return' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1358:4: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_RETURN"

    // $ANTLR start "KW_BREAK"
    public final void mKW_BREAK() throws RecognitionException {
        try {
            int _type = KW_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1361:2: ( 'break' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1361:4: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_BREAK"

    // $ANTLR start "KW_VAR"
    public final void mKW_VAR() throws RecognitionException {
        try {
            int _type = KW_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1364:2: ( 'var' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1364:4: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_VAR"

    // $ANTLR start "KW_THROW"
    public final void mKW_THROW() throws RecognitionException {
        try {
            int _type = KW_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1367:2: ( 'throw' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1367:4: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_THROW"

    // $ANTLR start "KW_THIS"
    public final void mKW_THIS() throws RecognitionException {
        try {
            int _type = KW_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1370:2: ( 'this' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1370:4: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_THIS"

    // $ANTLR start "KW_BASE"
    public final void mKW_BASE() throws RecognitionException {
        try {
            int _type = KW_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1373:2: ( 'base' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1373:4: 'base'
            {
            match("base"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_BASE"

    // $ANTLR start "KW_THROWS"
    public final void mKW_THROWS() throws RecognitionException {
        try {
            int _type = KW_THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1376:2: ( 'throws' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1376:4: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_THROWS"

    // $ANTLR start "KW_REQUIRES"
    public final void mKW_REQUIRES() throws RecognitionException {
        try {
            int _type = KW_REQUIRES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1379:2: ( 'requires' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1379:4: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_REQUIRES"

    // $ANTLR start "KW_ENSURES"
    public final void mKW_ENSURES() throws RecognitionException {
        try {
            int _type = KW_ENSURES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1382:2: ( 'ensures' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1382:4: 'ensures'
            {
            match("ensures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ENSURES"

    // $ANTLR start "KW_DELEGATE"
    public final void mKW_DELEGATE() throws RecognitionException {
        try {
            int _type = KW_DELEGATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1385:2: ( 'delegate' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1385:4: 'delegate'
            {
            match("delegate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_DELEGATE"

    // $ANTLR start "KW_SIGNAL"
    public final void mKW_SIGNAL() throws RecognitionException {
        try {
            int _type = KW_SIGNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1388:2: ( 'signal' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1388:4: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SIGNAL"

    // $ANTLR start "KW_CONST"
    public final void mKW_CONST() throws RecognitionException {
        try {
            int _type = KW_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1391:2: ( 'const' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1391:4: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CONST"

    // $ANTLR start "KW_DEFAULT"
    public final void mKW_DEFAULT() throws RecognitionException {
        try {
            int _type = KW_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1394:2: ( 'default' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1394:4: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_DEFAULT"

    // $ANTLR start "KW_IF"
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1397:2: ( 'if' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1397:4: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IF"

    // $ANTLR start "KW_ELSE"
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1400:2: ( 'else' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1400:4: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ELSE"

    // $ANTLR start "KW_SWITCH"
    public final void mKW_SWITCH() throws RecognitionException {
        try {
            int _type = KW_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1403:2: ( 'switch' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1403:4: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SWITCH"

    // $ANTLR start "KW_CASE"
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1406:2: ( 'case' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1406:4: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CASE"

    // $ANTLR start "KW_WHILE"
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1409:2: ( 'while' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1409:4: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_WHILE"

    // $ANTLR start "KW_DO"
    public final void mKW_DO() throws RecognitionException {
        try {
            int _type = KW_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1412:2: ( 'do' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1412:4: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_DO"

    // $ANTLR start "KW_FOR"
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1415:2: ( 'for' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1415:4: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FOR"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1418:2: ( '0x' ( HEXDIGIT )+ )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1419:2: '0x' ( HEXDIGIT )+
            {
            match("0x"); 

            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1420:2: ( HEXDIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1420:3: HEXDIGIT
            	    {
            	    mHEXDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1424:2: ( ( '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ ) | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* | ( '0' .. '9' )+ ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )+ ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            int alt13=3;
            switch ( input.LA(1) ) {
            case '@':
                {
                alt13=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt13=2;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1425:2: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
                    {
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1425:2: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1425:4: '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
                    {
                    match('@'); 
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1425:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1429:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1430:2: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1434:2: ( '0' .. '9' )+ ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )+ ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                    {
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1434:2: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1434:3: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1435:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1435:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
                    	    {
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1436:2: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "VERBATIM_LITERAL"
    public final void mVERBATIM_LITERAL() throws RecognitionException {
        try {
            int _type = VERBATIM_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1440:2: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1441:2: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
            {
            match("\"\"\""); 

            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1442:2: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\"') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='\"') ) {
                        int LA14_3 = input.LA(3);

                        if ( (LA14_3=='\"') ) {
                            alt14=2;
                        }
                        else if ( ((LA14_3>='\u0000' && LA14_3<='!')||(LA14_3>='#' && LA14_3<='\uFFFF')) ) {
                            alt14=1;
                        }


                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='!')||(LA14_1>='#' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1442:29: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERBATIM_LITERAL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1447:2: ( '\"' ( ESCAPE | ~ ( '\\\\' | '\"' ) )* '\"' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1448:2: '\"' ( ESCAPE | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1449:2: ( ESCAPE | ~ ( '\\\\' | '\"' ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    alt15=1;
                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1450:3: ESCAPE
            	    {
            	    mESCAPE(); 

            	    }
            	    break;
            	case 2 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1451:5: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "SHIFT_LEFT"
    public final void mSHIFT_LEFT() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1457:2: ( '<<' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1458:2: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHIFT_LEFT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1461:2: ( ',' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1461:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1464:2: ( ';' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1464:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1467:2: ( '[' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1467:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1470:2: ( ']' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1470:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1473:2: ( '(' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1473:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1476:2: ( ')' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1476:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "INCR_ASSIGN"
    public final void mINCR_ASSIGN() throws RecognitionException {
        try {
            int _type = INCR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1479:2: ( '+=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1479:4: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCR_ASSIGN"

    // $ANTLR start "DECR_ASSIGN"
    public final void mDECR_ASSIGN() throws RecognitionException {
        try {
            int _type = DECR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1482:2: ( '-=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1482:4: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECR_ASSIGN"

    // $ANTLR start "OR_ASSIGN"
    public final void mOR_ASSIGN() throws RecognitionException {
        try {
            int _type = OR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1485:2: ( '|=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1485:4: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR_ASSIGN"

    // $ANTLR start "AND_ASSIGN"
    public final void mAND_ASSIGN() throws RecognitionException {
        try {
            int _type = AND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1488:2: ( '&=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1488:4: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND_ASSIGN"

    // $ANTLR start "XOR_ASSIGN"
    public final void mXOR_ASSIGN() throws RecognitionException {
        try {
            int _type = XOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1491:2: ( '^=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1491:4: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR_ASSIGN"

    // $ANTLR start "DIV_ASSIGN"
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1494:2: ( '/=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1494:4: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV_ASSIGN"

    // $ANTLR start "MUL_ASSIGN"
    public final void mMUL_ASSIGN() throws RecognitionException {
        try {
            int _type = MUL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1497:2: ( '*=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1497:4: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL_ASSIGN"

    // $ANTLR start "MOD_ASSIGN"
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1500:2: ( '%=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1500:4: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD_ASSIGN"

    // $ANTLR start "SHL_ASSIGN"
    public final void mSHL_ASSIGN() throws RecognitionException {
        try {
            int _type = SHL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1503:2: ( '<<=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1503:4: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHL_ASSIGN"

    // $ANTLR start "SHR_ASSIGN"
    public final void mSHR_ASSIGN() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1507:2: ()
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1507:4: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "SHR_ASSIGN"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1511:2: ()
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1511:4: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1514:2: ( '>' ( ({...}? => ( '>=' ) ) | ({...}? => ( '=' ) ) | () ) )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1515:2: '>' ( ({...}? => ( '>=' ) ) | ({...}? => ( '=' ) ) | () )
            {
            match('>'); 
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1516:2: ( ({...}? => ( '>=' ) ) | ({...}? => ( '=' ) ) | () )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='>') && (( input.LA(1) == '>' && input.LA(2) == '=' ))) {
                alt16=1;
            }
            else if ( (LA16_0=='=') && (( input.LA(1) == '=' ))) {
                alt16=2;
            }
            else {
                alt16=3;}
            switch (alt16) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1517:3: ({...}? => ( '>=' ) )
                    {
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1517:3: ({...}? => ( '>=' ) )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1518:4: {...}? => ( '>=' )
                    {
                    if ( !(( input.LA(1) == '>' && input.LA(2) == '=' )) ) {
                        throw new FailedPredicateException(input, "GT", " input.LA(1) == '>' && input.LA(2) == '=' ");
                    }
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1519:4: ( '>=' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1519:5: '>='
                    {
                    match(">="); 

                     _type = SHR_ASSIGN; /*System.out.println("SHR_ASSIGN!");*/ 

                    }


                    }


                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1522:3: ({...}? => ( '=' ) )
                    {
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1522:3: ({...}? => ( '=' ) )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1523:4: {...}? => ( '=' )
                    {
                    if ( !(( input.LA(1) == '=' )) ) {
                        throw new FailedPredicateException(input, "GT", " input.LA(1) == '=' ");
                    }
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1524:4: ( '=' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1524:5: '='
                    {
                    match('='); 
                     _type = GTEQ; /*System.out.println("GTEQ!");*/ 

                    }


                    }


                    }
                    break;
                case 3 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1527:3: ()
                    {
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1527:3: ()
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1527:4: 
                    {
                    _type = GT; /*System.out.println("GT!");*/ 

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1531:2: ( '?' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1531:4: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "COALESCE"
    public final void mCOALESCE() throws RecognitionException {
        try {
            int _type = COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1534:2: ( '??' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1534:4: '??'
            {
            match("??"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COALESCE"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1537:2: ( ':' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1537:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "BOOL_OR"
    public final void mBOOL_OR() throws RecognitionException {
        try {
            int _type = BOOL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1540:2: ( '||' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1540:4: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOL_OR"

    // $ANTLR start "BOOL_AND"
    public final void mBOOL_AND() throws RecognitionException {
        try {
            int _type = BOOL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1543:2: ( '&&' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1543:4: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOL_AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1546:2: ( '|' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1546:4: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1549:2: ( '&' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1549:4: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1552:2: ( '^' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1552:4: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1555:2: ( '==' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1555:4: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1558:2: ( '!=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1558:4: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1561:2: ( '<=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1561:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1564:2: ( '*' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1564:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1567:2: ( '+' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1567:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1570:2: ( '-' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1570:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1573:2: ( '/' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1573:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1576:2: ( '%' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1576:4: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1579:2: ( '!' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1579:4: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "BITWISE_NOT"
    public final void mBITWISE_NOT() throws RecognitionException {
        try {
            int _type = BITWISE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1582:2: ( '~' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1582:4: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITWISE_NOT"

    // $ANTLR start "INCREMENT"
    public final void mINCREMENT() throws RecognitionException {
        try {
            int _type = INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1585:2: ( '++' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1585:4: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCREMENT"

    // $ANTLR start "DECREMENT"
    public final void mDECREMENT() throws RecognitionException {
        try {
            int _type = DECREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1588:2: ( '--' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1588:4: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECREMENT"

    // $ANTLR start "POINTER_ACCESS"
    public final void mPOINTER_ACCESS() throws RecognitionException {
        try {
            int _type = POINTER_ACCESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1591:2: ( '->' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1591:4: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINTER_ACCESS"

    // $ANTLR start "LCURL"
    public final void mLCURL() throws RecognitionException {
        try {
            int _type = LCURL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1594:2: ( '{' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1594:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURL"

    // $ANTLR start "RCURL"
    public final void mRCURL() throws RecognitionException {
        try {
            int _type = RCURL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1597:2: ( '}' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1597:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURL"

    // $ANTLR start "TEMPLATE_START"
    public final void mTEMPLATE_START() throws RecognitionException {
        try {
            int _type = TEMPLATE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1600:2: ( '@\"' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1600:4: '@\"'
            {
            match("@\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPLATE_START"

    // $ANTLR start "QUOT"
    public final void mQUOT() throws RecognitionException {
        try {
            int _type = QUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1603:2: ( '\"' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1603:4: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOT"

    // $ANTLR start "LAMBDA"
    public final void mLAMBDA() throws RecognitionException {
        try {
            int _type = LAMBDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1606:2: ( '=>' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1606:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAMBDA"

    // $ANTLR start "ELIPSIS"
    public final void mELIPSIS() throws RecognitionException {
        try {
            int _type = ELIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1609:2: ( '...' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1609:4: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELIPSIS"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1611:4: ( '<' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1612:2: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "ASSIGNMENT"
    public final void mASSIGNMENT() throws RecognitionException {
        try {
            int _type = ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1615:2: ( '=' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1616:2: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGNMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1618:18: ()
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1618:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "RANGE"
    public final void mRANGE() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1619:16: ()
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1619:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RANGE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1620:14: ( '.' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1620:16: '.'
            {
            match('.'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1623:2: ( ( DIGITS )+ ({...}? => DOT ( DIGITS )? ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? () | ( EXPONENT | ) ) | DIGITS ( 'd' | 'D' | 'f' | 'F' ) | DOT ({...}? => ( DIGITS ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? ) | DOT | ) )
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1624:2: ( DIGITS )+ ({...}? => DOT ( DIGITS )? ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? () | ( EXPONENT | ) )
                    {
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1624:2: ( DIGITS )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1624:2: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1625:2: ({...}? => DOT ( DIGITS )? ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? () | ( EXPONENT | ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='.') && ((
                    			!((input.LA(2) >= 'a' && input.LA(2) <= 'z')
                    			|| (input.LA(2) >= 'A' && input.LA(2) <= 'Z'))
                    		))) {
                        alt22=1;
                    }
                    else {
                        alt22=2;}
                    switch (alt22) {
                        case 1 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1626:3: {...}? => DOT ( DIGITS )? ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? ()
                            {
                            if ( !((
                            			!((input.LA(2) >= 'a' && input.LA(2) <= 'z')
                            			|| (input.LA(2) >= 'A' && input.LA(2) <= 'Z'))
                            		)) ) {
                                throw new FailedPredicateException(input, "REAL", "\r\n\t\t\t!((input.LA(2) >= 'a' && input.LA(2) <= 'z')\r\n\t\t\t|| (input.LA(2) >= 'A' && input.LA(2) <= 'Z'))\r\n\t\t");
                            }
                            mDOT(); 
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1630:7: ( DIGITS )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1630:7: DIGITS
                                    {
                                    mDIGITS(); 

                                    }
                                    break;

                            }

                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1630:15: ( EXPONENT )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0=='E'||LA19_0=='e') ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1630:15: EXPONENT
                                    {
                                    mEXPONENT(); 

                                    }
                                    break;

                            }

                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1630:25: ( 'd' | 'D' | 'f' | 'F' )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:
                                    {
                                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1631:3: ()
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1632:4: 
                            {
                             _type = REAL; 

                            }


                            }
                            break;
                        case 2 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1635:3: ( EXPONENT | )
                            {
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1635:3: ( EXPONENT | )
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0=='E'||LA21_0=='e') ) {
                                alt21=1;
                            }
                            else {
                                alt21=2;}
                            switch (alt21) {
                                case 1 :
                                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1636:4: EXPONENT
                                    {
                                    mEXPONENT(); 
                                     _type = REAL; 

                                    }
                                    break;
                                case 2 :
                                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1639:4: 
                                    {
                                     _type = INTEGER; 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1643:3: DIGITS ( 'd' | 'D' | 'f' | 'F' )
                    {
                    mDIGITS(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                     _type = REAL; 

                    }
                    break;
                case 3 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1648:2: DOT ({...}? => ( DIGITS ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? ) | DOT | )
                    {
                    mDOT(); 
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1649:2: ({...}? => ( DIGITS ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? ) | DOT | )
                    int alt25=3;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>='0' && LA25_0<='9')) && ((
                    			!((input.LA(-2) >= 'a' && input.LA(-2) <= 'z')
                    			|| (input.LA(-2) >= 'A' && input.LA(-2) <= 'Z'))
                    		))) {
                        alt25=1;
                    }
                    else if ( (LA25_0=='.') ) {
                        alt25=2;
                    }
                    else {
                        alt25=3;}
                    switch (alt25) {
                        case 1 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1650:3: {...}? => ( DIGITS ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? )
                            {
                            if ( !((
                            			!((input.LA(-2) >= 'a' && input.LA(-2) <= 'z')
                            			|| (input.LA(-2) >= 'A' && input.LA(-2) <= 'Z'))
                            		)) ) {
                                throw new FailedPredicateException(input, "REAL", "\r\n\t\t\t!((input.LA(-2) >= 'a' && input.LA(-2) <= 'z')\r\n\t\t\t|| (input.LA(-2) >= 'A' && input.LA(-2) <= 'Z'))\r\n\t\t");
                            }
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1654:3: ( DIGITS ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? )
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1655:4: DIGITS ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )?
                            {
                            mDIGITS(); 
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1655:11: ( EXPONENT )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0=='E'||LA23_0=='e') ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1655:11: EXPONENT
                                    {
                                    mEXPONENT(); 

                                    }
                                    break;

                            }

                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1655:21: ( 'd' | 'D' | 'f' | 'F' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0=='D'||LA24_0=='F'||LA24_0=='d'||LA24_0=='f') ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:
                                    {
                                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                             _type = REAL; 

                            }


                            }
                            break;
                        case 2 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1659:3: DOT
                            {
                            mDOT(); 
                             _type = RANGE; 

                            }
                            break;
                        case 3 :
                            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1662:3: 
                            {
                             _type = DOT; 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1668:5: ( ( '0' .. '9' )+ )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1668:9: ( '0' .. '9' )+
            {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1668:9: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1668:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1672:2: ( '\\'' ( ESCAPE | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1672:5: '\\'' ( ESCAPE | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1672:11: ( ESCAPE | ~ ( '\\'' | '\\\\' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                alt28=1;
            }
            else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1672:13: ESCAPE
                    {
                    mESCAPE(); 

                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1672:22: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "LINE_COMMAND"
    public final void mLINE_COMMAND() throws RecognitionException {
        try {
            int _type = LINE_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1676:2: ( ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' ) )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1677:2: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1677:2: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1677:3: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1678:2: (~ ( '\\n' | '\\r' ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1678:2: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1679:2: ( '\\r' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1679:2: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMAND"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1685:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1685:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1685:22: ( '+' | '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='+'||LA31_0=='-') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1685:33: ( '0' .. '9' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='0' && LA32_0<='9')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1685:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEXDIGIT"
    public final void mHEXDIGIT() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1688:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1688:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEXDIGIT"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1692:6: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE | OCTAL )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt33=1;
                    }
                    break;
                case 'u':
                    {
                    alt33=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt33=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1692:8: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1693:8: UNICODE
                    {
                    mUNICODE(); 

                    }
                    break;
                case 3 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1694:8: OCTAL
                    {
                    mOCTAL(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "OCTAL"
    public final void mOCTAL() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\\') ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1>='0' && LA34_1<='3')) ) {
                    int LA34_2 = input.LA(3);

                    if ( ((LA34_2>='0' && LA34_2<='7')) ) {
                        int LA34_4 = input.LA(4);

                        if ( ((LA34_4>='0' && LA34_4<='7')) ) {
                            alt34=1;
                        }
                        else {
                            alt34=2;}
                    }
                    else {
                        alt34=3;}
                }
                else if ( ((LA34_1>='4' && LA34_1<='7')) ) {
                    int LA34_3 = input.LA(3);

                    if ( ((LA34_3>='0' && LA34_3<='7')) ) {
                        alt34=2;
                    }
                    else {
                        alt34=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:10: ( '0' .. '3' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:11: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:21: ( '0' .. '7' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:22: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:32: ( '0' .. '7' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1699:33: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1700:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1700:10: ( '0' .. '7' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1700:11: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1700:21: ( '0' .. '7' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1700:22: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1701:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1701:10: ( '0' .. '7' )
                    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1701:11: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL"

    // $ANTLR start "UNICODE"
    public final void mUNICODE() throws RecognitionException {
        try {
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1706:6: ( '\\\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1706:10: '\\\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
            {
            match('\\'); 
            match('u'); 
            mHEXDIGIT(); 
            mHEXDIGIT(); 
            mHEXDIGIT(); 
            mHEXDIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE"

    // $ANTLR start "GLOBAL_NS"
    public final void mGLOBAL_NS() throws RecognitionException {
        try {
            int _type = GLOBAL_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1710:2: ( 'global::' )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1711:2: 'global::'
            {
            match("global::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GLOBAL_NS"

    // $ANTLR start "REGEX_LITERAL"
    public final void mREGEX_LITERAL() throws RecognitionException {
        try {
            int _type = REGEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1715:2: ( '/--this-is-not-complete-yet--' {...}? => (~ ( '/' ) | '\\\\/' )+ '/' ( 'g' | 'm' | 'i' )* )
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1716:2: '/--this-is-not-complete-yet--' {...}? => (~ ( '/' ) | '\\\\/' )+ '/' ( 'g' | 'm' | 'i' )*
            {
            match("/--this-is-not-complete-yet--"); 

            if ( !((
            		input.LA(-1) == '/'
            	)) ) {
                throw new FailedPredicateException(input, "REGEX_LITERAL", "\r\n\t\tinput.LA(-1) == '/'\r\n\t");
            }
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1720:2: (~ ( '/' ) | '\\\\/' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=3;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1720:3: ~ ( '/' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1721:4: '\\\\/'
            	    {
            	    match("\\/"); 


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            match('/'); 
            // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1723:2: ( 'g' | 'm' | 'i' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='g'||LA36_0=='i'||LA36_0=='m') ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:
            	    {
            	    if ( input.LA(1)=='g'||input.LA(1)=='i'||input.LA(1)=='m' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEX_LITERAL"

    public void mTokens() throws RecognitionException {
        // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:8: ( WHITESPACE | COMMENT_JAVADOC | COMMENT | LINE_COMMENT | KW_USING | KW_CONSTRUCT | KW_SET | KW_GET | KW_IN | KW_IS | KW_AS | KW_VOID | KW_DYNAMIC | KW_OWNED | KW_WEAK | KW_UNOWNED | KW_TRUE | KW_FALSE | KW_NULL | KW_NEW | KW_YIELD | KW_SIZEOF | KW_TYPEOF | KW_ASYNC | KW_CLASS | KW_STRUCT | KW_EXTERN | KW_INLINE | KW_STATIC | KW_ABSTRACT | KW_VIRTUAL | KW_OVERRIDE | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_ENUM | KW_ERRORDOMAIN | KW_INTERFACE | KW_NAMESPACE | KW_OUT | KW_REF | KW_PARAMS | KW_TRY | KW_CATCH | KW_FINALLY | KW_LOCK | KW_DELETE | KW_FOREACH | KW_CONTINUE | KW_RETURN | KW_BREAK | KW_VAR | KW_THROW | KW_THIS | KW_BASE | KW_THROWS | KW_REQUIRES | KW_ENSURES | KW_DELEGATE | KW_SIGNAL | KW_CONST | KW_DEFAULT | KW_IF | KW_ELSE | KW_SWITCH | KW_CASE | KW_WHILE | KW_DO | KW_FOR | HEX | IDENTIFIER | VERBATIM_LITERAL | STRING | SHIFT_LEFT | COMMA | SEMICOLON | LBRACKET | RBRACKET | LPAREN | RPAREN | INCR_ASSIGN | DECR_ASSIGN | OR_ASSIGN | AND_ASSIGN | XOR_ASSIGN | DIV_ASSIGN | MUL_ASSIGN | MOD_ASSIGN | SHL_ASSIGN | GT | QUESTION | COALESCE | COLON | BOOL_OR | BOOL_AND | OR | AND | XOR | EQUAL | NOT_EQUAL | LTEQ | MULTIPLY | PLUS | MINUS | DIV | MOD | NOT | BITWISE_NOT | INCREMENT | DECREMENT | POINTER_ACCESS | LCURL | RCURL | TEMPLATE_START | QUOT | LAMBDA | ELIPSIS | LT | ASSIGNMENT | REAL | CHAR | LINE_COMMAND | GLOBAL_NS | REGEX_LITERAL )
        int alt37=125;
        alt37 = dfa37.predict(input);
        switch (alt37) {
            case 1 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:10: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 2 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:21: COMMENT_JAVADOC
                {
                mCOMMENT_JAVADOC(); 

                }
                break;
            case 3 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:37: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 4 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:45: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 5 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:58: KW_USING
                {
                mKW_USING(); 

                }
                break;
            case 6 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:67: KW_CONSTRUCT
                {
                mKW_CONSTRUCT(); 

                }
                break;
            case 7 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:80: KW_SET
                {
                mKW_SET(); 

                }
                break;
            case 8 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:87: KW_GET
                {
                mKW_GET(); 

                }
                break;
            case 9 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:94: KW_IN
                {
                mKW_IN(); 

                }
                break;
            case 10 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:100: KW_IS
                {
                mKW_IS(); 

                }
                break;
            case 11 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:106: KW_AS
                {
                mKW_AS(); 

                }
                break;
            case 12 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:112: KW_VOID
                {
                mKW_VOID(); 

                }
                break;
            case 13 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:120: KW_DYNAMIC
                {
                mKW_DYNAMIC(); 

                }
                break;
            case 14 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:131: KW_OWNED
                {
                mKW_OWNED(); 

                }
                break;
            case 15 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:140: KW_WEAK
                {
                mKW_WEAK(); 

                }
                break;
            case 16 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:148: KW_UNOWNED
                {
                mKW_UNOWNED(); 

                }
                break;
            case 17 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:159: KW_TRUE
                {
                mKW_TRUE(); 

                }
                break;
            case 18 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:167: KW_FALSE
                {
                mKW_FALSE(); 

                }
                break;
            case 19 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:176: KW_NULL
                {
                mKW_NULL(); 

                }
                break;
            case 20 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:184: KW_NEW
                {
                mKW_NEW(); 

                }
                break;
            case 21 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:191: KW_YIELD
                {
                mKW_YIELD(); 

                }
                break;
            case 22 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:200: KW_SIZEOF
                {
                mKW_SIZEOF(); 

                }
                break;
            case 23 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:210: KW_TYPEOF
                {
                mKW_TYPEOF(); 

                }
                break;
            case 24 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:220: KW_ASYNC
                {
                mKW_ASYNC(); 

                }
                break;
            case 25 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:229: KW_CLASS
                {
                mKW_CLASS(); 

                }
                break;
            case 26 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:238: KW_STRUCT
                {
                mKW_STRUCT(); 

                }
                break;
            case 27 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:248: KW_EXTERN
                {
                mKW_EXTERN(); 

                }
                break;
            case 28 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:258: KW_INLINE
                {
                mKW_INLINE(); 

                }
                break;
            case 29 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:268: KW_STATIC
                {
                mKW_STATIC(); 

                }
                break;
            case 30 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:278: KW_ABSTRACT
                {
                mKW_ABSTRACT(); 

                }
                break;
            case 31 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:290: KW_VIRTUAL
                {
                mKW_VIRTUAL(); 

                }
                break;
            case 32 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:301: KW_OVERRIDE
                {
                mKW_OVERRIDE(); 

                }
                break;
            case 33 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:313: KW_PRIVATE
                {
                mKW_PRIVATE(); 

                }
                break;
            case 34 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:324: KW_PROTECTED
                {
                mKW_PROTECTED(); 

                }
                break;
            case 35 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:337: KW_PUBLIC
                {
                mKW_PUBLIC(); 

                }
                break;
            case 36 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:347: KW_INTERNAL
                {
                mKW_INTERNAL(); 

                }
                break;
            case 37 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:359: KW_ENUM
                {
                mKW_ENUM(); 

                }
                break;
            case 38 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:367: KW_ERRORDOMAIN
                {
                mKW_ERRORDOMAIN(); 

                }
                break;
            case 39 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:382: KW_INTERFACE
                {
                mKW_INTERFACE(); 

                }
                break;
            case 40 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:395: KW_NAMESPACE
                {
                mKW_NAMESPACE(); 

                }
                break;
            case 41 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:408: KW_OUT
                {
                mKW_OUT(); 

                }
                break;
            case 42 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:415: KW_REF
                {
                mKW_REF(); 

                }
                break;
            case 43 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:422: KW_PARAMS
                {
                mKW_PARAMS(); 

                }
                break;
            case 44 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:432: KW_TRY
                {
                mKW_TRY(); 

                }
                break;
            case 45 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:439: KW_CATCH
                {
                mKW_CATCH(); 

                }
                break;
            case 46 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:448: KW_FINALLY
                {
                mKW_FINALLY(); 

                }
                break;
            case 47 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:459: KW_LOCK
                {
                mKW_LOCK(); 

                }
                break;
            case 48 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:467: KW_DELETE
                {
                mKW_DELETE(); 

                }
                break;
            case 49 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:477: KW_FOREACH
                {
                mKW_FOREACH(); 

                }
                break;
            case 50 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:488: KW_CONTINUE
                {
                mKW_CONTINUE(); 

                }
                break;
            case 51 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:500: KW_RETURN
                {
                mKW_RETURN(); 

                }
                break;
            case 52 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:510: KW_BREAK
                {
                mKW_BREAK(); 

                }
                break;
            case 53 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:519: KW_VAR
                {
                mKW_VAR(); 

                }
                break;
            case 54 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:526: KW_THROW
                {
                mKW_THROW(); 

                }
                break;
            case 55 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:535: KW_THIS
                {
                mKW_THIS(); 

                }
                break;
            case 56 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:543: KW_BASE
                {
                mKW_BASE(); 

                }
                break;
            case 57 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:551: KW_THROWS
                {
                mKW_THROWS(); 

                }
                break;
            case 58 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:561: KW_REQUIRES
                {
                mKW_REQUIRES(); 

                }
                break;
            case 59 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:573: KW_ENSURES
                {
                mKW_ENSURES(); 

                }
                break;
            case 60 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:584: KW_DELEGATE
                {
                mKW_DELEGATE(); 

                }
                break;
            case 61 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:596: KW_SIGNAL
                {
                mKW_SIGNAL(); 

                }
                break;
            case 62 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:606: KW_CONST
                {
                mKW_CONST(); 

                }
                break;
            case 63 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:615: KW_DEFAULT
                {
                mKW_DEFAULT(); 

                }
                break;
            case 64 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:626: KW_IF
                {
                mKW_IF(); 

                }
                break;
            case 65 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:632: KW_ELSE
                {
                mKW_ELSE(); 

                }
                break;
            case 66 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:640: KW_SWITCH
                {
                mKW_SWITCH(); 

                }
                break;
            case 67 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:650: KW_CASE
                {
                mKW_CASE(); 

                }
                break;
            case 68 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:658: KW_WHILE
                {
                mKW_WHILE(); 

                }
                break;
            case 69 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:667: KW_DO
                {
                mKW_DO(); 

                }
                break;
            case 70 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:673: KW_FOR
                {
                mKW_FOR(); 

                }
                break;
            case 71 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:680: HEX
                {
                mHEX(); 

                }
                break;
            case 72 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:684: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 73 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:695: VERBATIM_LITERAL
                {
                mVERBATIM_LITERAL(); 

                }
                break;
            case 74 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:712: STRING
                {
                mSTRING(); 

                }
                break;
            case 75 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:719: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 

                }
                break;
            case 76 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:730: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 77 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:736: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 78 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:746: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 79 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:755: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 80 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:764: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 81 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:771: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 82 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:778: INCR_ASSIGN
                {
                mINCR_ASSIGN(); 

                }
                break;
            case 83 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:790: DECR_ASSIGN
                {
                mDECR_ASSIGN(); 

                }
                break;
            case 84 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:802: OR_ASSIGN
                {
                mOR_ASSIGN(); 

                }
                break;
            case 85 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:812: AND_ASSIGN
                {
                mAND_ASSIGN(); 

                }
                break;
            case 86 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:823: XOR_ASSIGN
                {
                mXOR_ASSIGN(); 

                }
                break;
            case 87 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:834: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 

                }
                break;
            case 88 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:845: MUL_ASSIGN
                {
                mMUL_ASSIGN(); 

                }
                break;
            case 89 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:856: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 

                }
                break;
            case 90 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:867: SHL_ASSIGN
                {
                mSHL_ASSIGN(); 

                }
                break;
            case 91 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:878: GT
                {
                mGT(); 

                }
                break;
            case 92 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:881: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 93 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:890: COALESCE
                {
                mCOALESCE(); 

                }
                break;
            case 94 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:899: COLON
                {
                mCOLON(); 

                }
                break;
            case 95 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:905: BOOL_OR
                {
                mBOOL_OR(); 

                }
                break;
            case 96 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:913: BOOL_AND
                {
                mBOOL_AND(); 

                }
                break;
            case 97 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:922: OR
                {
                mOR(); 

                }
                break;
            case 98 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:925: AND
                {
                mAND(); 

                }
                break;
            case 99 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:929: XOR
                {
                mXOR(); 

                }
                break;
            case 100 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:933: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 101 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:939: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 102 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:949: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 103 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:954: MULTIPLY
                {
                mMULTIPLY(); 

                }
                break;
            case 104 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:963: PLUS
                {
                mPLUS(); 

                }
                break;
            case 105 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:968: MINUS
                {
                mMINUS(); 

                }
                break;
            case 106 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:974: DIV
                {
                mDIV(); 

                }
                break;
            case 107 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:978: MOD
                {
                mMOD(); 

                }
                break;
            case 108 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:982: NOT
                {
                mNOT(); 

                }
                break;
            case 109 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:986: BITWISE_NOT
                {
                mBITWISE_NOT(); 

                }
                break;
            case 110 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:998: INCREMENT
                {
                mINCREMENT(); 

                }
                break;
            case 111 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1008: DECREMENT
                {
                mDECREMENT(); 

                }
                break;
            case 112 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1018: POINTER_ACCESS
                {
                mPOINTER_ACCESS(); 

                }
                break;
            case 113 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1033: LCURL
                {
                mLCURL(); 

                }
                break;
            case 114 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1039: RCURL
                {
                mRCURL(); 

                }
                break;
            case 115 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1045: TEMPLATE_START
                {
                mTEMPLATE_START(); 

                }
                break;
            case 116 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1060: QUOT
                {
                mQUOT(); 

                }
                break;
            case 117 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1065: LAMBDA
                {
                mLAMBDA(); 

                }
                break;
            case 118 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1072: ELIPSIS
                {
                mELIPSIS(); 

                }
                break;
            case 119 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1080: LT
                {
                mLT(); 

                }
                break;
            case 120 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1083: ASSIGNMENT
                {
                mASSIGNMENT(); 

                }
                break;
            case 121 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1094: REAL
                {
                mREAL(); 

                }
                break;
            case 122 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1099: CHAR
                {
                mCHAR(); 

                }
                break;
            case 123 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1104: LINE_COMMAND
                {
                mLINE_COMMAND(); 

                }
                break;
            case 124 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1117: GLOBAL_NS
                {
                mGLOBAL_NS(); 

                }
                break;
            case 125 :
                // c:\\maqdev\\dev\\carbonfx\\vala-netbeans\\antlr\\Vala.g:1:1127: REGEX_LITERAL
                {
                mREGEX_LITERAL(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA6_eotS =
        "\2\uffff\2\5\2\uffff";
    static final String DFA6_eofS =
        "\6\uffff";
    static final String DFA6_minS =
        "\2\57\2\0\2\uffff";
    static final String DFA6_maxS =
        "\2\57\2\uffff\2\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\2\uffff\1\0\1\1\2\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\12\3\1\4\2\3\1\4\ufff2\3",
            "\12\3\1\4\2\3\1\4\ufff2\3",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1209:6: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_2 = input.LA(1);

                        s = -1;
                        if ( ((LA6_2>='\u0000' && LA6_2<='\t')||(LA6_2>='\u000B' && LA6_2<='\f')||(LA6_2>='\u000E' && LA6_2<='\uFFFF')) ) {s = 3;}

                        else if ( (LA6_2=='\n'||LA6_2=='\r') ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_3 = input.LA(1);

                        s = -1;
                        if ( (LA6_3=='\n'||LA6_3=='\r') ) {s = 4;}

                        else if ( ((LA6_3>='\u0000' && LA6_3<='\t')||(LA6_3>='\u000B' && LA6_3<='\f')||(LA6_3>='\u000E' && LA6_3<='\uFFFF')) ) {s = 3;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA26_eofS =
        "\5\uffff";
    static final String DFA26_minS =
        "\1\56\1\60\3\uffff";
    static final String DFA26_maxS =
        "\1\71\1\146\3\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\3\1\1\1\2";
    static final String DFA26_specialS =
        "\5\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\1\uffff\12\1",
            "\12\1\12\uffff\1\4\1\uffff\1\4\35\uffff\1\4\1\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1622:1: REAL : ( ( DIGITS )+ ({...}? => DOT ( DIGITS )? ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? () | ( EXPONENT | ) ) | DIGITS ( 'd' | 'D' | 'f' | 'F' ) | DOT ({...}? => ( DIGITS ( EXPONENT )? ( 'd' | 'D' | 'f' | 'F' )? ) | DOT | ) );";
        }
    }
    static final String DFA35_eotS =
        "\4\uffff\1\3\1\uffff\1\3";
    static final String DFA35_eofS =
        "\7\uffff";
    static final String DFA35_minS =
        "\1\0\1\uffff\1\0\1\uffff\1\0\1\uffff\1\0";
    static final String DFA35_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\3\1\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA35_specialS =
        "\1\3\1\uffff\1\2\1\uffff\1\0\1\uffff\1\1}>";
    static final String[] DFA35_transitionS = {
            "\57\3\1\1\54\3\1\2\uffa3\3",
            "",
            "\57\3\1\4\uffd0\3",
            "",
            "\147\5\1\6\1\5\1\6\3\5\1\6\uff92\5",
            "",
            "\147\5\1\6\1\5\1\6\3\5\1\6\uff92\5"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1720:2: (~ ( '/' ) | '\\\\/' )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_4 = input.LA(1);

                        s = -1;
                        if ( ((LA35_4>='\u0000' && LA35_4<='f')||LA35_4=='h'||(LA35_4>='j' && LA35_4<='l')||(LA35_4>='n' && LA35_4<='\uFFFF')) ) {s = 5;}

                        else if ( (LA35_4=='g'||LA35_4=='i'||LA35_4=='m') ) {s = 6;}

                        else s = 3;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_6 = input.LA(1);

                        s = -1;
                        if ( ((LA35_6>='\u0000' && LA35_6<='f')||LA35_6=='h'||(LA35_6>='j' && LA35_6<='l')||(LA35_6>='n' && LA35_6<='\uFFFF')) ) {s = 5;}

                        else if ( (LA35_6=='g'||LA35_6=='i'||LA35_6=='m') ) {s = 6;}

                        else s = 3;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                        s = -1;
                        if ( (LA35_2=='/') ) {s = 4;}

                        else if ( ((LA35_2>='\u0000' && LA35_2<='.')||(LA35_2>='0' && LA35_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_0 = input.LA(1);

                        s = -1;
                        if ( (LA35_0=='/') ) {s = 1;}

                        else if ( (LA35_0=='\\') ) {s = 2;}

                        else if ( ((LA35_0>='\u0000' && LA35_0<='.')||(LA35_0>='0' && LA35_0<='[')||(LA35_0>=']' && LA35_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\1\2\2\uffff\1\71\23\31\1\154\2\uffff\1\154\1\161\1\164\6\uffff"+
        "\1\167\1\173\1\176\1\u0081\1\u0083\1\u0085\1\u0087\1\uffff\1\u0089"+
        "\1\uffff\1\u008c\1\u008e\3\uffff\1\154\7\uffff\13\31\1\u00a0\1\u00a1"+
        "\1\u00a2\1\u00a4\6\31\1\u00ac\34\31\3\uffff\1\160\2\uffff\1\u00d2"+
        "\34\uffff\1\154\6\31\1\u00db\5\31\1\u00e1\3\31\3\uffff\1\31\1\uffff"+
        "\3\31\1\u00e9\3\31\1\uffff\2\31\1\u00ef\3\31\1\u00f3\5\31\1\u00fa"+
        "\1\31\1\u00fc\13\31\1\u0108\5\31\2\u010e\1\31\4\uffff\6\31\1\u0115"+
        "\1\uffff\5\31\1\uffff\5\31\1\u0120\1\31\1\uffff\5\31\1\uffff\1\u0128"+
        "\1\31\1\u012a\1\uffff\2\31\1\u012d\3\31\1\uffff\1\u0131\1\uffff"+
        "\3\31\1\u0135\2\31\1\u0138\4\31\1\uffff\2\31\1\u013f\1\31\1\u0141"+
        "\1\uffff\1\u0142\1\31\1\u0145\1\31\1\u0147\1\u0148\1\uffff\10\31"+
        "\1\u0152\1\31\1\uffff\5\31\1\u0159\1\31\1\uffff\1\u015b\1\uffff"+
        "\1\31\1\u015e\1\uffff\1\u015f\2\31\1\uffff\1\31\1\u0163\1\31\1\uffff"+
        "\2\31\1\uffff\6\31\1\uffff\1\u016d\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175\1\31\1\u0177\2\31\1\uffff"+
        "\3\31\1\u017d\2\31\1\uffff\1\31\1\uffff\1\u0181\1\u0182\2\uffff"+
        "\3\31\1\uffff\1\u0186\4\31\1\u018b\1\u018c\1\u018d\1\31\1\uffff"+
        "\1\u018f\2\31\7\uffff\3\31\1\u0195\1\u0196\1\uffff\1\31\1\u0198"+
        "\1\31\2\uffff\1\u019a\1\u019b\1\31\1\uffff\1\u019d\1\31\1\u019f"+
        "\1\31\3\uffff\1\31\1\uffff\1\31\1\u01a3\1\u01a4\1\31\1\u01a6\2\uffff"+
        "\1\u01a7\1\uffff\1\u01a8\2\uffff\1\31\1\uffff\1\31\1\uffff\1\31"+
        "\1\u01ac\1\u01ad\2\uffff\1\u01ae\3\uffff\1\u01af\1\31\1\u01b1\4"+
        "\uffff\1\31\1\uffff\1\u01b3\1\uffff";
    static final String DFA37_eofS =
        "\u01b4\uffff";
    static final String DFA37_minS =
        "\1\11\2\uffff\1\52\1\156\1\141\2\145\1\146\1\142\1\141\1\145\1"+
        "\165\1\145\1\150\2\141\1\151\1\154\1\141\1\145\1\157\1\141\1\60"+
        "\1\42\1\uffff\1\60\1\0\1\74\6\uffff\1\53\1\55\1\75\1\46\3\75\1\uffff"+
        "\1\77\1\uffff\2\75\3\uffff\1\56\7\uffff\1\151\1\157\1\156\1\141"+
        "\1\163\1\164\1\147\1\141\1\151\1\164\1\157\4\60\1\163\1\151\2\162"+
        "\1\156\1\146\1\60\1\156\1\145\1\164\1\141\1\151\1\165\1\160\1\151"+
        "\1\154\1\156\1\162\1\154\1\167\1\155\1\145\1\164\1\163\1\162\1\163"+
        "\1\151\1\142\1\162\1\146\1\143\1\145\1\163\1\60\1\53\3\uffff\1\42"+
        "\2\uffff\1\75\34\uffff\1\56\1\156\1\167\2\163\1\143\1\145\1\60\1"+
        "\145\1\156\1\165\2\164\1\60\1\142\1\151\1\145\3\uffff\1\156\1\uffff"+
        "\1\164\1\144\1\164\1\60\1\141\1\145\1\141\1\uffff\1\145\1\162\1"+
        "\60\1\153\1\154\1\145\1\60\1\145\1\157\2\163\1\141\1\60\1\154\1"+
        "\60\1\145\1\154\1\145\1\155\1\165\1\157\1\145\1\166\1\164\1\154"+
        "\1\141\1\60\2\165\1\153\1\141\1\145\3\60\4\uffff\1\147\1\156\1\164"+
        "\1\151\1\163\1\150\1\60\1\uffff\1\157\1\141\1\143\1\151\1\143\1"+
        "\uffff\1\141\1\156\1\162\1\143\1\162\1\60\1\165\1\uffff\1\155\1"+
        "\147\1\165\1\144\1\162\1\uffff\1\60\1\145\1\60\1\uffff\1\157\1\167"+
        "\1\60\1\145\1\154\1\141\1\uffff\1\60\1\uffff\1\163\1\144\1\162\1"+
        "\60\2\162\1\60\1\141\1\145\1\151\1\155\1\uffff\1\162\1\151\1\60"+
        "\1\153\1\60\1\uffff\1\60\1\145\1\60\1\156\2\60\1\uffff\1\146\1\154"+
        "\1\164\1\143\1\150\1\154\1\145\1\146\1\60\1\141\1\uffff\1\141\1"+
        "\151\1\145\1\141\1\154\1\60\1\151\1\uffff\1\60\1\uffff\1\146\1\60"+
        "\1\uffff\1\60\1\154\1\143\1\uffff\1\160\1\60\1\156\1\uffff\1\145"+
        "\1\144\1\uffff\1\164\2\143\1\163\1\156\1\162\1\uffff\1\60\2\uffff"+
        "\1\144\1\165\1\uffff\1\165\2\uffff\5\60\1\72\1\60\2\141\1\uffff"+
        "\1\143\1\154\1\143\1\60\2\164\1\uffff\1\144\1\uffff\2\60\2\uffff"+
        "\1\171\1\150\1\141\1\uffff\1\60\1\163\1\157\1\145\1\164\3\60\1\145"+
        "\1\uffff\1\60\1\143\1\145\7\uffff\1\154\1\143\1\164\2\60\1\uffff"+
        "\1\145\1\60\1\145\2\uffff\2\60\1\143\1\uffff\1\60\1\155\1\60\1\145"+
        "\3\uffff\1\163\1\uffff\1\164\2\60\1\145\1\60\2\uffff\1\60\1\uffff"+
        "\1\60\2\uffff\1\145\1\uffff\1\141\1\uffff\1\144\2\60\2\uffff\1\60"+
        "\3\uffff\1\60\1\151\1\60\4\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA37_maxS =
        "\1\176\2\uffff\1\75\1\163\1\157\1\167\1\154\2\163\1\157\1\171\1"+
        "\167\1\150\1\171\1\157\1\165\1\151\1\170\1\165\1\145\1\157\1\162"+
        "\2\172\1\uffff\1\172\1\uffff\1\75\6\uffff\1\75\1\76\1\174\4\75\1"+
        "\uffff\1\77\1\uffff\1\76\1\75\3\uffff\1\56\7\uffff\1\151\1\157\1"+
        "\156\1\141\2\164\1\172\1\162\1\151\1\164\1\157\4\172\1\163\1\151"+
        "\2\162\1\156\1\154\1\172\1\156\1\145\1\164\1\141\1\151\1\171\1\160"+
        "\1\162\1\154\1\156\1\162\1\154\1\167\1\155\1\145\1\164\1\165\1\162"+
        "\1\163\1\157\1\142\1\162\1\164\1\143\1\145\1\163\1\146\1\71\3\uffff"+
        "\1\42\2\uffff\1\75\34\uffff\1\56\1\156\1\167\1\164\1\163\1\143\1"+
        "\145\1\172\1\145\1\156\1\165\2\164\1\172\1\142\1\151\1\145\3\uffff"+
        "\1\156\1\uffff\1\164\1\144\1\164\1\172\1\141\1\145\1\141\1\uffff"+
        "\1\145\1\162\1\172\1\153\1\154\1\145\1\172\1\145\1\157\2\163\1\141"+
        "\1\172\1\154\1\172\1\145\1\154\1\145\1\155\1\165\1\157\1\145\1\166"+
        "\1\164\1\154\1\141\1\172\2\165\1\153\1\141\1\145\2\172\1\71\4\uffff"+
        "\1\147\1\156\1\164\1\151\1\163\1\150\1\172\1\uffff\1\157\1\141\1"+
        "\143\1\151\1\143\1\uffff\1\141\1\156\1\162\1\143\1\162\1\172\1\165"+
        "\1\uffff\1\155\1\164\1\165\1\144\1\162\1\uffff\1\172\1\145\1\172"+
        "\1\uffff\1\157\1\167\1\172\1\145\1\154\1\141\1\uffff\1\172\1\uffff"+
        "\1\163\1\144\1\162\1\172\2\162\1\172\1\141\1\145\1\151\1\155\1\uffff"+
        "\1\162\1\151\1\172\1\153\1\172\1\uffff\1\172\1\145\1\172\1\156\2"+
        "\172\1\uffff\1\146\1\154\1\164\1\143\1\150\1\154\1\145\1\156\1\172"+
        "\1\141\1\uffff\1\141\1\151\1\145\1\141\1\154\1\172\1\151\1\uffff"+
        "\1\172\1\uffff\1\146\1\172\1\uffff\1\172\1\154\1\143\1\uffff\1\160"+
        "\1\172\1\156\1\uffff\1\145\1\144\1\uffff\1\164\2\143\1\163\1\156"+
        "\1\162\1\uffff\1\172\2\uffff\1\144\1\165\1\uffff\1\165\2\uffff\5"+
        "\172\1\72\1\172\2\141\1\uffff\1\143\1\154\1\143\1\172\2\164\1\uffff"+
        "\1\144\1\uffff\2\172\2\uffff\1\171\1\150\1\141\1\uffff\1\172\1\163"+
        "\1\157\1\145\1\164\3\172\1\145\1\uffff\1\172\1\143\1\145\7\uffff"+
        "\1\154\1\143\1\164\2\172\1\uffff\1\145\1\172\1\145\2\uffff\2\172"+
        "\1\143\1\uffff\1\172\1\155\1\172\1\145\3\uffff\1\163\1\uffff\1\164"+
        "\2\172\1\145\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\145\1\uffff"+
        "\1\141\1\uffff\1\144\2\172\2\uffff\1\172\3\uffff\1\172\1\151\1\172"+
        "\4\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\26\uffff\1\110\3\uffff\1\114\1\115\1\116\1\117"+
        "\1\120\1\121\7\uffff\1\133\1\uffff\1\136\2\uffff\1\155\1\161\1\162"+
        "\1\uffff\1\172\1\173\1\3\1\4\1\127\1\175\1\152\62\uffff\1\171\1"+
        "\110\1\163\1\uffff\1\112\1\164\1\uffff\1\146\1\167\1\122\1\156\1"+
        "\150\1\123\1\157\1\160\1\151\1\124\1\137\1\141\1\125\1\140\1\142"+
        "\1\126\1\143\1\130\1\147\1\131\1\153\1\135\1\134\1\144\1\165\1\170"+
        "\1\145\1\154\21\uffff\1\11\1\12\1\100\1\uffff\1\13\7\uffff\1\105"+
        "\43\uffff\1\111\1\132\1\113\1\166\7\uffff\1\7\5\uffff\1\10\7\uffff"+
        "\1\65\5\uffff\1\51\3\uffff\1\54\6\uffff\1\106\1\uffff\1\24\13\uffff"+
        "\1\52\5\uffff\1\107\6\uffff\1\103\12\uffff\1\14\7\uffff\1\17\1\uffff"+
        "\1\21\2\uffff\1\67\3\uffff\1\23\3\uffff\1\45\2\uffff\1\101\6\uffff"+
        "\1\57\1\uffff\1\70\1\5\2\uffff\1\76\1\uffff\1\31\1\55\11\uffff\1"+
        "\30\6\uffff\1\16\1\uffff\1\104\2\uffff\1\66\1\22\3\uffff\1\25\11"+
        "\uffff\1\64\3\uffff\1\26\1\75\1\32\1\35\1\102\1\174\1\34\5\uffff"+
        "\1\60\3\uffff\1\27\1\71\3\uffff\1\33\4\uffff\1\43\1\53\1\63\1\uffff"+
        "\1\20\5\uffff\1\37\1\15\1\uffff\1\77\1\uffff\1\56\1\61\1\uffff\1"+
        "\73\1\uffff\1\41\3\uffff\1\62\1\44\1\uffff\1\36\1\74\1\40\3\uffff"+
        "\1\72\1\6\1\47\1\50\1\uffff\1\42\1\uffff\1\46";
    static final String DFA37_specialS =
        "\33\uffff\1\0\u0198\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\1\1\uffff\2\1\22\uffff\1\1\1\56\1\33\1\64\1\uffff\1\51\1"+
            "\46\1\63\1\41\1\42\1\50\1\43\1\35\1\44\1\62\1\3\1\27\11\32\1"+
            "\54\1\36\1\34\1\55\1\52\1\53\1\30\32\31\1\37\1\uffff\1\40\1"+
            "\47\1\31\1\uffff\1\11\1\26\1\5\1\13\1\22\1\17\1\7\1\31\1\10"+
            "\2\31\1\25\1\31\1\20\1\14\1\23\1\31\1\24\1\6\1\16\1\4\1\12\1"+
            "\15\1\31\1\21\1\31\1\60\1\45\1\61\1\57",
            "",
            "",
            "\1\65\2\uffff\1\70\1\uffff\1\66\15\uffff\1\67",
            "\1\73\4\uffff\1\72",
            "\1\76\12\uffff\1\75\2\uffff\1\74",
            "\1\77\3\uffff\1\100\12\uffff\1\101\2\uffff\1\102",
            "\1\103\6\uffff\1\104",
            "\1\107\7\uffff\1\105\4\uffff\1\106",
            "\1\111\20\uffff\1\110",
            "\1\114\7\uffff\1\113\5\uffff\1\112",
            "\1\116\11\uffff\1\117\11\uffff\1\115",
            "\1\122\1\121\1\120",
            "\1\123\2\uffff\1\124",
            "\1\127\11\uffff\1\125\6\uffff\1\126",
            "\1\130\7\uffff\1\131\5\uffff\1\132",
            "\1\135\3\uffff\1\134\17\uffff\1\133",
            "\1\136",
            "\1\142\1\uffff\1\140\3\uffff\1\141\5\uffff\1\137",
            "\1\145\20\uffff\1\143\2\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\151\20\uffff\1\150",
            "\12\32\7\uffff\3\31\1\155\1\153\1\155\24\31\4\uffff\1\31\1"+
            "\uffff\3\31\1\155\1\153\1\155\21\31\1\152\2\31",
            "\1\156\15\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32"+
            "\31",
            "",
            "\12\32\7\uffff\3\31\1\155\1\153\1\155\24\31\4\uffff\1\31\1"+
            "\uffff\3\31\1\155\1\153\1\155\24\31",
            "\42\160\1\157\uffdd\160",
            "\1\162\1\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166\21\uffff\1\165",
            "\1\171\17\uffff\1\170\1\172",
            "\1\174\76\uffff\1\175",
            "\1\u0080\26\uffff\1\177",
            "\1\u0082",
            "\1\u0084",
            "\1\u0086",
            "",
            "\1\u0088",
            "",
            "\1\u008a\1\u008b",
            "\1\u008d",
            "",
            "",
            "",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095\1\u0094",
            "\1\u0096",
            "\1\u0098\22\uffff\1\u0097",
            "\1\u009a\20\uffff\1\u0099",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\u009e\7"+
            "\31\1\u009f\6\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\30\31\1\u00a3\1"+
            "\31",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00ab\5\uffff\1\u00aa",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\3\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\10\uffff\1\u00b5",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00c0\1\uffff\1\u00bf",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\5\uffff\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\12\uffff\1\u00c9\2\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\u00ce\7\uffff\6\u00cd\32\uffff\6\u00cd",
            "\1\154\1\uffff\1\154\2\uffff\12\u00cf",
            "",
            "",
            "",
            "\1\u00d0",
            "",
            "",
            "\1\u00d1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "",
            "",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\u00f9\25"+
            "\31",
            "\1\u00fb",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\u00ce\7\uffff\6\u00cd\24\31\4\uffff\1\31\1\uffff\6\u00cd"+
            "\24\31",
            "\12\u00ce\7\uffff\6\u00ce\24\31\4\uffff\1\31\1\uffff\6\u00ce"+
            "\24\31",
            "\12\u00cf",
            "",
            "",
            "",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0124\14\uffff\1\u0123",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0129",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u012b",
            "\1\u012c",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0136",
            "\1\u0137",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0140",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0143",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31\1\u0144\10"+
            "\31",
            "\1\u0146",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0151\7\uffff\1\u0150",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u015a",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u015c",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\u015d\7"+
            "\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0160",
            "\1\u0161",
            "",
            "\1\u0162",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0170",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0176",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u018e",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0190",
            "\1\u0191",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0197",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0199",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u019c",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u019e",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u01a0",
            "",
            "",
            "",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u01a5",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u01a9",
            "",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u01b0",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "\1\u01b2",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WHITESPACE | COMMENT_JAVADOC | COMMENT | LINE_COMMENT | KW_USING | KW_CONSTRUCT | KW_SET | KW_GET | KW_IN | KW_IS | KW_AS | KW_VOID | KW_DYNAMIC | KW_OWNED | KW_WEAK | KW_UNOWNED | KW_TRUE | KW_FALSE | KW_NULL | KW_NEW | KW_YIELD | KW_SIZEOF | KW_TYPEOF | KW_ASYNC | KW_CLASS | KW_STRUCT | KW_EXTERN | KW_INLINE | KW_STATIC | KW_ABSTRACT | KW_VIRTUAL | KW_OVERRIDE | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_ENUM | KW_ERRORDOMAIN | KW_INTERFACE | KW_NAMESPACE | KW_OUT | KW_REF | KW_PARAMS | KW_TRY | KW_CATCH | KW_FINALLY | KW_LOCK | KW_DELETE | KW_FOREACH | KW_CONTINUE | KW_RETURN | KW_BREAK | KW_VAR | KW_THROW | KW_THIS | KW_BASE | KW_THROWS | KW_REQUIRES | KW_ENSURES | KW_DELEGATE | KW_SIGNAL | KW_CONST | KW_DEFAULT | KW_IF | KW_ELSE | KW_SWITCH | KW_CASE | KW_WHILE | KW_DO | KW_FOR | HEX | IDENTIFIER | VERBATIM_LITERAL | STRING | SHIFT_LEFT | COMMA | SEMICOLON | LBRACKET | RBRACKET | LPAREN | RPAREN | INCR_ASSIGN | DECR_ASSIGN | OR_ASSIGN | AND_ASSIGN | XOR_ASSIGN | DIV_ASSIGN | MUL_ASSIGN | MOD_ASSIGN | SHL_ASSIGN | GT | QUESTION | COALESCE | COLON | BOOL_OR | BOOL_AND | OR | AND | XOR | EQUAL | NOT_EQUAL | LTEQ | MULTIPLY | PLUS | MINUS | DIV | MOD | NOT | BITWISE_NOT | INCREMENT | DECREMENT | POINTER_ACCESS | LCURL | RCURL | TEMPLATE_START | QUOT | LAMBDA | ELIPSIS | LT | ASSIGNMENT | REAL | CHAR | LINE_COMMAND | GLOBAL_NS | REGEX_LITERAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_27 = input.LA(1);

                        s = -1;
                        if ( (LA37_27=='\"') ) {s = 111;}

                        else if ( ((LA37_27>='\u0000' && LA37_27<='!')||(LA37_27>='#' && LA37_27<='\uFFFF')) ) {s = 112;}

                        else s = 113;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
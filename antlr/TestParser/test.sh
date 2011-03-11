
for f in $(find $1 -iname "*.vala")
do
echo "Processing: $f"
java -jar "dist/TestParser.jar" $f
done
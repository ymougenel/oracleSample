
compile: 
	find ./ -name "*.java" -exec javac {} \;
	
clean:
	find ./ -name "*.class" -exec rm {} \;

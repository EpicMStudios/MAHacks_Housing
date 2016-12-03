all: housing

housing:
	javac -classpath lib/ -d bin src/*.java

test: housing
	cd bin/; java Main

.PHONY: test

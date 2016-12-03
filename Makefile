all: housing

housing:
	javac -classpath lib/ -d bin src/*.java

spark:
<<<<<<< HEAD
	curl -s -o spark.tar.gz http://d3kbcqa49mib13.cloudfront.net/spark-2.0.2-bin-hadoop2.7.tgz
=======
	wget -nc -o spark.tar.gz http://d3kbcqa49mib13.cloudfront.net/spark-2.0.2-bin-hadoop2.7.tgz
>>>>>>> 87ec73c0c36aca19c6fb7fa15facabaf5aec1e14
	tar xvfz spark.tar.gz
	mv spark-2.0.2-bin-hadoop2.7/jars/*.jar lib/

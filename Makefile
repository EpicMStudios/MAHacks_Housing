all: housing

housing:
	javac -classpath lib/ -d bin src/*.java

spark:
	wget -nc -o spark.tar.gz http://d3kbcqa49mib13.cloudfront.net/spark-2.0.2-bin-hadoop2.7.tgz
	tar xvfz spark.tar.gz
	mv spark-2.0.2-bin-hadoop2.7/jars/*.jar lib/

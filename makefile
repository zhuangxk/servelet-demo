test:
	echo 123

compile:
	javac -classpath "/Users/toko/.m2/repository/javax/servlet/servlet-api/2.5/servlet-api-2.5.jar" -d WEB-INF/classes  src/Myservlet.java

deploy:
	cp -r /Users/toko/Projects/demo/java/myservelet/WEB-INF/ /Users/toko/Projects/soft/apache-tomcat-9.0.44/webapps/demo/WEB-INF/

start:
	/Users/toko/Projects/soft/apache-tomcat-9.0.44/bin/startup.sh

stop:
	/Users/toko/Projects/soft/apache-tomcat-9.0.44/bin/shutdown.sh

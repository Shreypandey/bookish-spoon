# bookish-spoon
# Prerequisite for Java Class

## Installation Instructions for Java 

We will be using Java 8 for the class due to its support with netbeans 8.2. It won't be any difference.
Sorry for the mention of latest version in the previous post.


1. 
	1. For Linux
	Follow the steps provided in this StackOverFlow [answer](https://stackoverflow.com/a/14788468/9566322) 
	2. For Windows
	Download the appropriate installer from this [link](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html). And then install the exe as you always do. xP
3. Set the environment variable
   1. For Linux
	   1. Get installation path by running `sudo update-alternatives --config java`. You'll get path of Java there
		2. Open Environment file by `sudo gedit /etc/environment`
		3. Add Java installation path you got from 1 in the end of the file `JAVA_HOME="<Path here>"`
		4. For reloading the variables`source /etc/environment`  
   2. For Windows
		   Can refer to this [article ](https://mkyong.com/java/how-to-set-java_home-on-windows-10/)

## Installation Instructions for Netbeans IDE 


Please install Netbeans 8.2 as it that will be a lot easier.
And install JDK before installing netbeans, else an error will be thrown.

1. Download the appropriate installer according to your OS from the [link](https://netbeans.org/downloads/old/8.2/).
2. Use the following command to install the downloaded package
   1. For Linux 
	   1. Open terminal in the location where installer script is downloaded
	   2. Give execute permission by `chmod +x <script_name.sh>`
	   3. Run the script by `./<script_name.sh>` 
   2. For Windows
		   `Install the exe as you always do!!! xP`
 

## P.S

In case of any query, feel free to contact any coordinator. :smile:

# WebAutomation
#  Introduction
  This repository is made for Web Automation of Login Module on PhasorLab website whose main aim is to connect people with wireless technologies.
# Installation
  You will need to install
  *  Java JDK-1.8 [Java Installation](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
     
     - Download java jdk based on Windows Operating system from the above mentioned link.
     - Configure java path in System variables
  * Eclipse [Install Eclipse](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/3a/eclipse-java-oxygen-3a-win32-x86_64.zip)
    - After Installing it, unzip the files in your system. Launch eclipse through eclipse.exe file.
 * Selenium -3.11.0 [Download Selenium jars](https://www.seleniumhq.org/download/)
   - After Installing it, unzip the files in your system. Give the knowledge of Selenium jars to your code just by adding external paths into it.
  * Apache common-lang-3-3.7.jar [Install common-lang jars](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.0)
    - After Installing it, unzip the files in your system. Give the knowledge of Apache common lang jars to your code just by adding external paths into it.
  * Java client -6.0.0 [Additional java client jars](https://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22io.appium%22%20AND%20a%3A%22java-client%22)
    - Give the knowledge of java client jars to your code just by adding external paths into it.
  * TestNG framework  [TestNG plugin](http://testng.org/doc/download.html)
    - Configure TestNG framework from the above mentioned link. Go to -Install from update site section
    -  Select Help / Install New Software in Eclipse 
    -  Enter the update site URL in "Work with:" field:
    - Update site for release: http://beust.com/eclipse.
      - Or, Update site for beta: http://beust.org/eclipse-beta , use it if you want to experiment with the new features or verify the bug fixes, and please report back if you encounter any issues.
    - Make sure the check box next to URL is checked and click Next.
    - Eclipse will then guide you through the process.
  
# Prerequisites before running the Script
  * Set System Properties 
    - You can either use chrome.exe while which I have uploaded in this repository or you can invoke chrome exe file by following steps-
   
    - [Invoke Chrome exe file](https://chromedriver.storage.googleapis.com/index.html?path=2.39/)
     - Install- chromedriver_win32.zip . After Installing it, unzip the files in your system. And copy that exe file either in your C drive or any work directory.
     - Now just replace the value in the code  
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\DOGETHER\\Desktop\\Website\\chromedriver.exe");
           C:\\Users\\DOGETHER\\Desktop\\Website\\chromedriver.exe - Replace this value. Value should be where you have placed chromedriver.exe file in your system.
 * And at last, you are all set to run the script. Just right click and Select Run as TestNG.
 
# Contact
  - If you have any questions about this repository, or need some help to contribute, please do not hesitate to contact me.

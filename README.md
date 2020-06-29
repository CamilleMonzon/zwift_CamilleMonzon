# zwift_CamilleMonzon

----------------------------
If using WINDOWS

Download Zip file on Github: Clove -> Download ZIP (zwift_CamilleMonzon project)
Extract the file
Install Eclipse: Click the following link to download Eclipse https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2020-06/R/eclipse-java-2020-06-R-win32-x86_64.zip
After download, open file and double click the eclipse application file and click, “Extract All”
Install Java: Navigate to https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
Choose Windows x64 Installer Download
After extraction, double click on the Eclipse Application (logo should be displaying) to launch
Click Workbench
Right click on Package Explorer -> Import -> Maven -> Existing Maven Projects -> Browse -> Downloads -> zwift_CamilleMonzon-master -> zwift_CamilleMonzon 
Help -> Install New Software 
Enter https://dl.bintray.com/testng-team/testng-eclipse-release/6.14.3/ in “Work with:”
Click “Add”
After “Name:” enter “TestNG” -> Add
Tick “TestNG” package -> Next -> Next ->  Accept license agreement -> Finish
Click “Install Anyway” 
Eclipse will restart
Right click project name on Package Explorer -> Build Path -> Add Libraries -> TestNG -> Next -> Finish -> Apply and Close
Download Chromedriver: Download version of chromedriver compatible with your chrome (example: Chromedriver 83 only compatible with Chrome 83.0.4103.116) https://chromedriver.chromium.org/downloads
To check your chrome version;
Navigate to chrome://settings/help
OR Click on the Menu icon on top right corner of your chrome screen (three vertical dots)
Click Help
Click About Google Chrome
Click “chromedriver_win32.zip” and Extract all
On open src/main/java -> TestCases -> zwiftProject.java -> you must update chromedriver location
Change “//usr/local/bin/chromedriver” to (example: “C:\\Users\\camon\\Downloads\\chromedriver_win32\\chromedriver.exe")
On Eclipse, open src/main/java -> TestCases -> zwiftProject.java -> click Run
Open src/main/java -> Object_Repostory-> zwiftProject_Objects.java to view object repo


----------------------------
If using Mac


Get project: Clone the zwift_CamilleMonzon project
Extract the file 
Install Eclipse: Click the following link to download Eclipse https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2020-06/R/eclipse-jee-2020-06-R-macosx-cocoa-x86_64.dmg&mirror_id=1281
Open the downloaded  “eclipse-jee-2020-06-R-macosx-cocoa-x86_64.dmg”
Drag Eclipse to Application folder
Install Java: Navigate to https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
Choose macOS x64  Installer Download
Double click the downloaded “jdk-8u251-macosx-x64.dmg”
Double click the “Java Update 251.pkg” 
Go to System Preferences -> Security and Privacy -> General -> Click the lock to make changes (enter password) 
Under “Allow apps downloaded from:” choose “App Store and identified developers” -> Lock -> Open Anyway
Allow JDK to install -> once installed Move to Trash
Double click and open Eclipse Application
If this message appears, “The git command requires the command line developer tools. Would you like to install?” -> Choose install
Click Workbench
On Project Explorer -> Import Projects -> Maven -> Existing Maven Projects -> Next 
For “Root Directory:” Browse -> Downloads -> zwift_CamilleMonzon-master -> zwift_CamilleMoznon -> Open -> Finish
Right click on Package Explorer -> Import -> Maven -> Existing Maven Projects -> Browse -> Downloads -> zwift_CamilleMonzon-master -> zwift_CamilleMonzon 
Help -> Install New Software 
Enter https://dl.bintray.com/testng-team/testng-eclipse-release/6.14.3/ in “Work with:”
Click “Add”
After “Name:” enter “TestNG” -> Add
Tick “TestNG” package -> Next -> Next -> Accept license agreement -> Finish
Click “Install Anyway” 
Eclipse will restart
Right click project name on Package Explorer -> Build Path -> Add Libraries -> TestNG -> Next -> Finish -> Apply and Close
Download Chromedriver: Download version of chromedriver compatible with your chrome (example: Chromedriver 83 only compatible with Chrome 83.0.4103.116) https://chromedriver.chromium.org/downloads
To check your chrome version;
Navigate to chrome://settings/help
OR Click on the Menu icon on top right corner of your chrome screen (three vertical dots)
Click Help
Click About Google Chrome
Double click “chromedriver_mac64.zip”
On Eclipse open src/main/java -> TestCases -> zwiftProject.java -> you must update chromedriver location
Change “//usr/local/bin/chromedriver” to (example: “/Users/camon/Downloads/chromedriver")
If message appears, “chromedriver” cannot be opened because the developer cannot be verified.” -> Go to System Preferences -> Security and Privacy -> General -> Click the lock to make changes (enter password) 
Under “Allow apps downloaded from:” choose “App Store and identified developers” -> Lock -> Open Anyway
On Eclipse open src/main/java -> TestCases -> zwiftProject.java -> Attempt to run test -> Allow -> Open
Click Run
Open src/main/java -> Object_Repostory-> zwiftProject_Objects.java to view object repo

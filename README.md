# burying
Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.qq331617870:burying:1.0'
	}
Application:
        BuryingDBUtils.init(BaseApp.getInstance().BuryingDBManager());
        
        Activity:
        addBurying(String userid, long starttime, long endtime, String activity, String onclick);

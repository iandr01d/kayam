package asia.chumbaka.kitkitProvider;

/**
 * Created by ingtellect on 9/1/17.
 */


public class User {
    public static boolean DEFAULT_OPEN_LIBRARY = true;
    public static boolean DEFAULT_OPEN_TOOLS = true;

    private int _id;
    private String _username;
    private int _numStars;
    private boolean _finishTutorial;
    private boolean _unlockDrum;
    private boolean _unlockMarimba;
    private boolean _unlockDrawing;
    private boolean _unlockColoring;
    private boolean _unlockBlackboard;
    private boolean _finishLauncherTutorial;
    private String _displayName;
    private boolean _openLibrary;
    private boolean _openTools;
    private boolean _unlockFishBowl;
    private boolean _unlockWritingBoard;
    private boolean _finishWritingBoardTutorial;
    private boolean _acceptTnC;
    private String _password;
    private String _englishLevel;
    private String _mathLevel;
    private String _lastLogin;

    public User() {
        this._id = 0;
        this._username = "user";
        this._numStars = 0;
        this._finishTutorial = false;
        this._unlockDrum = false;
        this._unlockMarimba = false;
        this._unlockDrawing = false;
        this._unlockColoring = false;
        this._unlockBlackboard = false;
        this._finishLauncherTutorial = false;
        this._displayName = "";
        this._openLibrary = DEFAULT_OPEN_LIBRARY;
        this._openTools = DEFAULT_OPEN_TOOLS;
        this._unlockFishBowl = false;
        this._unlockWritingBoard = false;
        this._finishWritingBoardTutorial = false;
        this._englishLevel = "";
        this._mathLevel = "";
        this._acceptTnC = false;
    }

    public User(int id, String username, int stars) {
        this._id = id;
        this._username = username;
        this._numStars = stars;
        this._finishTutorial = false;
        this._unlockDrum = false;
        this._unlockMarimba = false;
        this._unlockDrawing = false;
        this._unlockColoring = false;
        this._unlockBlackboard = false;
        this._finishLauncherTutorial = false;
        this._displayName = "";
        this._openLibrary = DEFAULT_OPEN_LIBRARY;
        this._openTools = DEFAULT_OPEN_TOOLS;
        this._unlockFishBowl = false;
        this._unlockWritingBoard = false;
        this._finishWritingBoardTutorial = false;
        this._englishLevel = "";
        this._mathLevel = "";
        this._acceptTnC = false;
    }

    public User(String username, String displayName, String password) {
        this._username = username;
        this._numStars = 0;
        this._finishTutorial = false;
        this._unlockDrum = false;
        this._unlockMarimba = false;
        this._unlockDrawing = false;
        this._unlockColoring = false;
        this._unlockBlackboard = false;
        this._finishLauncherTutorial = false;
        this._openLibrary = DEFAULT_OPEN_LIBRARY;
        this._openTools = DEFAULT_OPEN_TOOLS;
        this._unlockFishBowl = false;
        this._unlockWritingBoard = false;
        this._finishWritingBoardTutorial = false;
        this._displayName = displayName;
        this._password = password;
        this._englishLevel = "0_0_0";
        this._mathLevel = "0_0_0";
        this._acceptTnC = false;
    }

    public void setID(int id) {
        this._id = id;
    }

    public int getID() {
        return this._id;
    }

    public void setUserName(String username) {
        this._username = username;
    }

    public String getUserName() {
        return this._username;
    }

    public void setPassword(String password) {
        this._password = password;
    }

    public String getPassword() {
        return this._password;
    }

    public void setNumStars(int stars) {
        this._numStars = stars;
    }

    public int getNumStars() {
        return this._numStars;
    }

    public void setFinishTutorial(boolean unlock) { this._finishTutorial = unlock; }

    public boolean isFinishTutorial() {return true; /*this._finishTutorial;*/}

    public void setUnlockDrum(boolean unlock) { this._unlockDrum = unlock; }

    public boolean isUnlockDrum() {return this._unlockDrum;}

    public void setUnlockMarimba(boolean unlock) { this._unlockMarimba = unlock; }

    public boolean isUnlockMarimba() {return this._unlockMarimba;}

    public void setUnlockDrawing(boolean unlock) { this._unlockDrawing = unlock; }

    public boolean isUnlockDrawing() {return this._unlockDrawing;}

    public void setUnlockColoring(boolean unlock) { this._unlockColoring = unlock; }

    public boolean isUnlockColoring() {return this._unlockColoring;}


    public void setUnlockBlackboard(boolean unlock) { this._unlockBlackboard = unlock; }

    public boolean isUnlockBlackboard() {return this._unlockBlackboard;}

    public void setFinishLauncherTutorial(boolean unlock) { this._finishLauncherTutorial = unlock; }

    public boolean isFinishLauncherTutorial() {return this._finishLauncherTutorial;}

    public void setDisplayName(String name) {
        _displayName = name;
    }

    public String getDisplayName() {
        return _displayName;
    }

    public void setOpenLibrary(boolean open) {
        _openLibrary = open;
    }

    public boolean isOpenLibrary() {
        return _openLibrary;
    }

    public void setOpenTools(boolean open) {
        _openTools = open;
    }

    public boolean isOpenTools() {
        return _openTools;
    }

    public void setUnlockFishBowl(boolean unlock) { this._unlockFishBowl = unlock; }

    public boolean isUnlockFishBowl() {return this._unlockFishBowl;}

    public void setUnlockWritingBoard(boolean unlock) { this._unlockWritingBoard = unlock; }

    public boolean isUnlockWritingBoard() {return this._unlockWritingBoard;}

    public void setFinishWritingBoardTutorial(boolean unlock) { this._finishWritingBoardTutorial = unlock; }

    public boolean isFinishWritingBoardTutorial() {return this._finishWritingBoardTutorial;}

    public void setCurrentEnglishLevel(String level) {
        _englishLevel = level;
    }

    public String getCurrentEnglishLevel() {
        return _englishLevel;
    }

    public void setCurrentMathLevel(String level) {
        _mathLevel = level;
    }

    public String getCurrentMathLevel() {
        return _mathLevel;
    }

    public void setLastLogin(String lastLogin) {
        _lastLogin = lastLogin;
    }

    public String getLastLogin() {
        return _lastLogin;
    }

    public void setAcceptTnC(boolean acceptTnC) { this._acceptTnC = acceptTnC; }

    public boolean isAcceptTnC() {return this._acceptTnC;}

    @Override
    public String toString() {
        return "Name: " + getDisplayName() + "\n" + "Num of stars: " + getNumStars() + "\n" + "English level: " + getCurrentEnglishLevel() + "\n" + "Math level: " + getCurrentMathLevel();
    }
}
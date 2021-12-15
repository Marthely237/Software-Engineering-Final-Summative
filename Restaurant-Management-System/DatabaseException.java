// Authors: Marthely_237 & luckyjohn-rwanda & Doreen

public class DatabaseException extends Exception {
    public String errMsg;
    public DatabaseException(String msg)
    { 
        errMsg = msg;
    }
    
    public String getErrMessage()
    {
        return errMsg;
    }
}

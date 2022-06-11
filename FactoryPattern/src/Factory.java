public class Factory {

    public  Notification createObj(String s){
        if(s==null){
            return null;
        }
        if(s.equalsIgnoreCase("Silent")){
            return  new Silent();
        }
        if(s.equalsIgnoreCase("Sound")){
            return  new Sound();
        }
        if(s.equalsIgnoreCase("Vibration")){
            return  new Vibration();
        }
        else{
            return null;
        }
    }
}

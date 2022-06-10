public class consoleLogger implements Chain{

    private Chain nextInChain;



    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void write(Message request) {
        if("error".equalsIgnoreCase(request.getCommand()) || "warning".equalsIgnoreCase(request.getCommand()) || "console".equalsIgnoreCase(request.getCommand()) ){
            System.out.println("Console Logging your Message");
        }
        if(nextInChain==null){

        }
        else
        {
            nextInChain.write(request);
        }
    }
}

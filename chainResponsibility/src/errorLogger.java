public class errorLogger implements Chain{

    private Chain nextInChain;



    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void write(Message request) {

        if("error".equalsIgnoreCase(request.getCommand())){
            System.out.println("Error Has Occured");
        }
        if(nextInChain==null){

        }
        else
        {
            nextInChain.write(request);
        }
    }
}

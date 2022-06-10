public class warningLogger implements Chain {


    private Chain nextInChain;



    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void write(Message request) {
        if("error".equalsIgnoreCase(request.getCommand()) || "warning".equalsIgnoreCase(request.getCommand()) ){
            System.out.println("Warning Has Occured");
        }
        if(nextInChain==null){

        }
        else
        {
            nextInChain.write(request);
        }
    }
}

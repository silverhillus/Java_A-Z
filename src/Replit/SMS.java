package Replit;

public class SMS {
    public static void main(String[] args) {
        String message=":<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        String sender=message.substring(message.indexOf("<")+1, message.indexOf(">"));
        String phoneNumber=message.substring(message.indexOf("[")+1, message.indexOf("]"));
        String messageBody=message.substring(message.indexOf("{")+1, message.length()-1 );

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);


        /*

        // replace()
        //sender=message.substring(1,indSender);
        int initialSender=message.indexOf("<")+1;
        int endSender=message.indexOf(">");

        int initialPhoneNum=message.indexOf("[")+1;
        int endPhoneNum=message.indexOf("]");

        int initialMessageBody=message.indexOf("{")+1;
        int endMessageBody=message.length()-1;

         sender=message.substring(initialSender,endSender);
        phoneNumber=message.substring(initialPhoneNum,endPhoneNum);
        messageBody=message.substring(initialMessageBody+1,endMessageBody );

         */




        System.out.println(sender);
        System.out.println(phoneNumber);
        System.out.println(messageBody);

    }
}

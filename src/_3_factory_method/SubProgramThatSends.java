package _3_factory_method;

import _3_factory_method.message.MessageSender;
import _3_factory_method.protocol.ProtocolWithMessageSending;

public class SubProgramThatSends {

    MessageSender sender;

    public SubProgramThatSends(MessageSender sender) {
        this.sender = sender;
    }

    public void run(){
        sender.send("hello");
        sender.send("good bye");
    }

}

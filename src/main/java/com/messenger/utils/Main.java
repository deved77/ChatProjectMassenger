package com.messenger.utils;

import com.messenger.utils.domain.User;
import com.messenger.utils.dto.UserLightDto;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("127.0.0.1", 9090);
        System.out.println("wllllll");

        ObjectOutputStream write = new ObjectOutputStream(socket.getOutputStream());

        MessageDto messageDto = new MessageDto<UserLightDto>(null, false, "", Command.REGISTER, new UserLightDto("Mohammed"));

        write.writeObject(messageDto);
        write.flush();
//        User user = new User("Mohammed","Mohammed", "ali",new Date(2023,2,23));


//        new Thread(new Runnable() {
//
//            @SneakyThrows
//            @Override
//            public void run() {
//                ObjectInputStream read = new ObjectInputStream(socket.getInputStream());
//                while (true) {
//                    MessageDto<UserLightDto> message ;
//                    message = (MessageDto<UserLightDto>) read.readObject();
//                    if (message.getCommand() == Command.MESSAGE) {
//                        System.out.println(message.getMessage());
//                        System.out.flush();
//                    }else
//                        System.err.println("error");
//                }
//            }
//        }).start();
        Scanner scanner = new Scanner(System.in);

        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    String msg = scanner.nextLine();
                    System.err.println(msg);
                    try {
                        MessageDto messageDto = new MessageDto<UserLightDto>(null, false, msg, Command.MESSAGE, new UserLightDto("Mohammed"));
                        System.err.println(messageDto);
                        write.writeObject(messageDto);
                        write.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();


    }
}

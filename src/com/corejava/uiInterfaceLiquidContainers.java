package com.corejava;

import java.util.Scanner;



public class uiInterfaceLiquidContainers {

    private Container container1;
    private Container container2;
    private Scanner scanner;

    public uiInterfaceLiquidContainers(Container container1, Container container2, Scanner scanner) {
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }
    public void startProgram() {
        while (true) {
            System.out.println("First: " + this.container1.toString());
            System.out.println("Second: " + this.container2.toString());
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equals("add")){
                this.container1.add(amount);
            } else if(command.equals("move")){
                if(amount > 0){
                    if(amount > this.container1.contains()){

                        this.container2.add(this.container1.contains());
                        this.container1.removeAmount(amount);

                    } else {
                        this.container1.removeAmount(amount);
                        this.container2.add(amount);
                    }
                }
            } else if(command.equals("remove")){
                this.container2.removeAmount(amount);
            }
        }
    }
}

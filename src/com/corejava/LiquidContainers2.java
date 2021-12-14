package com.corejava;

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        uiInterfaceLiquidContainers ui = new uiInterfaceLiquidContainers(container1, container2,scanner);
        ui.startProgram();
    }

}

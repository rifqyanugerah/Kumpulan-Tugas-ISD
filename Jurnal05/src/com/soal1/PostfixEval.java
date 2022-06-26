package com.soal1;

import java.util.Stack;

public class PostfixEval {
    private String iS;
    private Stack s;
    public PostfixEval (String iString) {
        iS = iString;
        s = new Stack();
        String outputString = "";
        boolean fI = false;
        for(int i = 0; i < iS.length(); i++) {
            char curChar = iS.charAt(i);
            if (!isOperator(curChar)) {
                outputString += Character.toString(curChar);
                if(i == (iS.length() - 1)) {
                    while (!s.empty()) {  //A+B-C
                        outputString += s.pop();
                    }
                }
            }
            else {
                if (fI) {
                    // if the last char in the stack has same operator presedence then it will be run
                    if (pMin(curChar) && pMin((Character)s.peek())) { // '+' or '-' level operator
                        outputString += s.pop(); // most priority operator: the first one
                        s.push(curChar);
                        if(i == (iS.length()-1)) {
                            while (!s.empty()) {
                                outputString += s.pop();
                            }
                        }
                    }
                    else if (mDiv(curChar) && mDiv((Character)s.peek())) { // '*' or '/' level operator
                        outputString += s.pop(); // most priority operator: the first one
                        s.push(curChar);
                        if(i == (iS.length()-1)) {
                            while (!s.empty()) {
                                outputString += s.pop();
                            }
                        }
                    } else if (pMin(curChar) && mDiv((Character)s.peek())) { // '+' or '-' meet '*' or '/'
                        outputString += s.pop(); // most priority operator: '*' or '/'
                        s.push(curChar);
                        if(i == (iS.length()-1)) {
                            while (!s.empty()) {
                                outputString += s.pop();
                            }
                        }
                    } else if(mDiv(curChar) && pMin((Character)s.peek())) { // '+' or '-' meet '*' or '/'
                        s.push(curChar); // most priority operator: '*' or '/'
                        if(i == (iS.length()-1)) {
                            while (!s.empty()) {
                                outputString += s.pop();
                            }
                        }
                    } else { // '^' level operator
                        outputString += Character.toString(curChar); // most priority operator '^'
                        if (i == (iS.length()-1)) {
                            while (!s.empty()) {
                                outputString += s.pop();
                            }
                        }
                    }
                } else {
                    s.push(curChar); // push the first char from iS into stack
                    fI = true;
                }
            }
        }
        System.out.println(outputString);
    }

    public boolean isOperator(char op) {
        switch(op) {
            case '+':
                return true;
            case '-':
                return true;
            case '/':
                return true;
            case '*':
                return true;
            case '^':
                return true;
            default:
                return false;
        }
    }

    public boolean pMin(char op) {
        switch(op) {
            case '+':
                return true;
            case '-':
                return true;
            default:
                return false;
        }
    }

    public boolean mDiv(char op) {
        switch(op) {
            case '*':
                return true;
            case '/':
                return true;
            default:
                return false;
        }
    }
}

package com.kcj.phraseomatic;


public class PhraseOMatic {

    public static void main(String[] args) {
        String[] wordListOne = {"JavaScript", "Java", "Python", "C#", "Ruby", "HTML/CSS",
            "PHP", "SQL", "Swift", "Rust", "Go", "TypeScript"};

        String[] wordListTwo = {"Elixir", "Scala", "Erlang", "Kotlin", "Dart",
            "R", "F#", "Julia", "Lua", "Groovy", "Hack", "COBOL", "Apex", "Nim", "VHDL", "Verilog", "Ada"};

        String[] wordListThree = {"Prolog", "Fortran", "Lisp", "Haskell", "Racket", "Smalltalk",
            "Scheme", "COBOL", "Ada", "Logo", "Forth", "Turing", "JScript"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " "
                + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase + " program");
    }
}

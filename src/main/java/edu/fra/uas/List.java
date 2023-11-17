package edu.fra.uas;

public interface List {

    char[] characters = null;
    
    public void add(char character){
        if(characters == null) {
            characters = new char[1];
            characters[0] = character;
        }

        char[] temp = new char[characters.length + 1];
        int idx;
        for(char c : characters){
            temp[idx] = c;
            idx++;
        }
        temp[idx] = character;
        characters = temp;
    }

}

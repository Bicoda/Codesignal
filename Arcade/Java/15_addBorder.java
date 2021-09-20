// Given a rectangular matrix of characters, add a border of asterisks(*) to it.

final class AddBorder {
    
    String[] addBorder(String[] picture) {
        String[] aResult = new String[picture.length+2];
        for(int i = 0 ; i < picture.length ; i++)
        {
            aResult[i+1] = '*' + picture[i] + '*';
        }
        aResult[0] = aResult[aResult.length-1] = aResult[1].replaceAll(".", "*");
        return aResult;
    }
}
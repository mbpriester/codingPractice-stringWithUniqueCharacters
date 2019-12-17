class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Test one: ahha " +doesStringHaveUniqueCharacters("ahha"));
    System.out.println("Test two: youare "+doesStringHaveUniqueCharacters("youare"));
  }

  public static Boolean doesStringHaveUniqueCharacters(String input){

    for(int i = 0; i < input.length(); i++){
      if(input.indexOf(input.charAt(i)) != input.lastIndexOf(input.charAt(i)))
        return false;
    }
    return true;
  }
}
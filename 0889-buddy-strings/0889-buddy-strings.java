class Solution {
  public boolean buddyStrings(String A, String B) {
    if (A.length() == 0 || B.length() == 0) {
      return false; // no swap is possible with empty strings
    }

    if (A.length() != B.length()) {
      return false; // Strings of different length can't be made equal with a Character swap
    }

    List<Character> charactersInMismatchesInA = new ArrayList<>();
    List<Character> charactersInMismatchesInB = new ArrayList<>();
    
    for (int index = 0; index < A.length(); ++index) {
      if (A.charAt(index) != B.charAt(index)) {
        charactersInMismatchesInA.add(A.charAt(index));
        charactersInMismatchesInB.add(B.charAt(index));
      }
    }

    int numberOfMismatches = charactersInMismatchesInA.size();

    switch(numberOfMismatches) {
      case 0:
        // identical Strings, but check whether we have two occurrences of same Character that we can swap
        Set<Character> s = new HashSet<>();
        for (char c : A.toCharArray()) {
          if (s.contains(c)) { // if Set already contains this Character, then String contains 2, so return true
            return true;
          } else {
            s.add(c); // add Character to Set in case we see another one later in String
          }
        }
        return false; // Strings A and B are equal, and there are no duplicate letters for us to swap, so return false
      case 1:
        return false; // if Strings A and B don't match, we need exactly 2 mismatches for us to swap, so return false
      case 2:
        if (charactersInMismatchesInA.get(0) == charactersInMismatchesInB.get(1) && charactersInMismatchesInA.get(1) == charactersInMismatchesInB.get(0)) { // if we have same two Characters in the two mismatches, then we can swap
          return true;
        } else {
          return false; // there must be 3 or more Characters in these mismatches, so return false
        }
      case 3:
        // fall through to default
      default: // if there are 3 or more mismatches, return false, since a single swap can't make the Strings equal
        return false;
    }


    // note: we return from switch block above
  }
}
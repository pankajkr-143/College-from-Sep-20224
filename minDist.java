
    public class minDist {

        public static int findMinDistance(String[] words, String word1, String word2) {
            int minDistance = Integer.MAX_VALUE;
            int lp1 = -1;  
            int lp2 = -1;  
            
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1)) {
                    lp1 = i;
                }
                if (words[i].equals(word2)) {
                    lp2 = i;
                }
                
                if (lp1 != -1 && lp2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lp1 - lp2));
                }
            }
            
            return minDistance;
        }
    
        public static void main(String[] args) {
            String[] words = {"the", "quick", "brown", "fox", "quick"};
            String word1 = "the";
            String word2 = "fox";
            
            int result = findMinDistance(words, word1, word2);
            System.out.println("Minimum distance: " + result);
        }
    }
    

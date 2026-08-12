// Last updated: 8/12/2026, 8:41:01 AM
class Solution {
    public String[] splitMessage(String message, int limit) {
        int msgSize = message.length();
        int numberOfDigits = 1;
        int nextChangeAt = 10;
        int finalNumParts = -1;
        for (int numParts = 1; numParts <= msgSize; numParts++) {
            if (numParts == nextChangeAt) {
                numberOfDigits++;
                nextChangeAt *= 10;
            }
            int minSizeOfSuffix = 3 + 1 + numberOfDigits; 

            int numCharsLeft = msgSize;
            
            int firstId = 1;
            int suffixSize = minSizeOfSuffix;
            while (firstId <= numParts) {
                int lastId = Math.min(firstId * 10 - 1, numParts);
                int numOfPartsInBand = lastId - firstId + 1;
                int charsPerPart = (limit - suffixSize);
                int totalChars = charsPerPart * numOfPartsInBand;
                numCharsLeft -= totalChars;

                suffixSize++;
                firstId = lastId + 1;
            }

            if (numCharsLeft <= 0) {
                finalNumParts = numParts;
                break;
            }
        }

        if (finalNumParts == -1){
            return new String[0];
        }

        String[] ans = new String[finalNumParts];
        int id = 1;
        int sizeOfSuffix = 3 + 1 + numberOfDigits;
        nextChangeAt = 10;
        int curIdxInMessage = 0;
        String endOfSuffix = "/" + String.valueOf(finalNumParts) + ">";
        for (int partId = 1; partId <= finalNumParts; partId++) {
            if (partId == nextChangeAt) {
                sizeOfSuffix++;
                nextChangeAt *= 10;
            }
            StringBuilder sb = new StringBuilder();
            int mainPartSize = limit - sizeOfSuffix;
            sb.append(message.substring(curIdxInMessage, Math.min(curIdxInMessage + mainPartSize, msgSize)));
            curIdxInMessage += mainPartSize;
            sb.append("<");
            sb.append(partId);
            sb.append(endOfSuffix);
            ans[partId - 1] = sb.toString();
        }
        return ans;
    }
}
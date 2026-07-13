class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        // for(int i = 0 ; i < address.length() ; i++){
        //     char ch = address.charAt(i);
        //     if(ch == "."){
        //         ch.repalce("[.]");
        //     }
        // }
        return address.replace(".","[.]");
    }
}
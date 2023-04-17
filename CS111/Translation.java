import java.util.*;
public class Translation {
    public static void main(String[] args)
    {
        String seqDNA = args[0];
        String seqRNA = "";

        //transcribe DNA to RNA 
        for(int i = 0; i < seqDNA.length(); i++ )
        {
            switch (seqDNA.charAt(i))
            {
                case 'A':
                    seqRNA+= "U";
                    break;
                case 'C':
                    seqRNA+= "G";
                    break;
                case 'G':
                    seqRNA+= "C";
                    break;
                case 'T':
                    seqRNA+= "A";
                    break;
            } 
        }

        //HashMap Values
        HashMap<String,String> codeSeq = new HashMap<String,String>();
        codeSeq.put("GCA", "Ala");
        codeSeq.put("GCC", "Ala");
        codeSeq.put("GCG", "Ala");
        codeSeq.put("GCU", "Ala");

        codeSeq.put("CGA", "Arg");
        codeSeq.put("CGC", "Arg");
        codeSeq.put("CGG", "Arg");
        codeSeq.put("CGU", "Arg");
        codeSeq.put("AGA", "Arg");
        codeSeq.put("AGG", "Arg");

        codeSeq.put("AAU", "Asn");
        codeSeq.put("AAC", "Asn");

        codeSeq.put("GAU", "Asp");
        codeSeq.put("GAC", "Asp");

        codeSeq.put("UGU", "Cys");
        codeSeq.put("UGC", "Cys");

        codeSeq.put("CAA", "Gln");
        codeSeq.put("CAG", "Gln");

        codeSeq.put("GAA", "Glu");
        codeSeq.put("GAG", "Glu");

        codeSeq.put("GGG", "Gly");
        codeSeq.put("GGC", "Gly");
        codeSeq.put("GGA", "Gly");
        codeSeq.put("GGU", "Gly");

        codeSeq.put("CAU", "His");
        codeSeq.put("CAC", "His");

        codeSeq.put("AUU", "Ile");
        codeSeq.put("AUC", "Ile");
        codeSeq.put("AUA", "Ile");

        codeSeq.put("CUG", "Leu");
        codeSeq.put("CUC", "Leu");
        codeSeq.put("CUA", "Leu");
        codeSeq.put("CUU", "Leu");
        codeSeq.put("UUA", "Leu");
        codeSeq.put("UUG", "Leu");

        codeSeq.put("AAA", "Lys");
        codeSeq.put("AAG", "Lys");

        codeSeq.put("AUG", "Met");

        codeSeq.put("UUC", "Phe");
        codeSeq.put("UUU", "Phe");

        codeSeq.put("CCG", "Pro");
        codeSeq.put("CCC", "Pro");
        codeSeq.put("CCA", "Pro");
        codeSeq.put("CCU", "Pro");

        codeSeq.put("UCG", "Ser");
        codeSeq.put("UCC", "Ser");
        codeSeq.put("UCA", "Ser");
        codeSeq.put("UCU", "Ser");
        codeSeq.put("AGU", "Ser");
        codeSeq.put("AGC", "Ser");

        codeSeq.put("ACG", "Thr");
        codeSeq.put("ACC", "Thr");
        codeSeq.put("ACA", "Thr");
        codeSeq.put("ACU", "Thr");
        
        codeSeq.put("UGG", "Trp");

        codeSeq.put("UAC", "Tyr");
        codeSeq.put("UAU", "Tyr");

        codeSeq.put("GUG", "Val");
        codeSeq.put("GUC", "Val");
        codeSeq.put("GUA", "Val");
        codeSeq.put("GUU", "Val");

        //cut off everything before start condon and after stop codon
        seqRNA = seqRNA.substring(seqRNA.indexOf("AUG"));
        if(seqRNA.indexOf("UGA") > 0)
        {
            seqRNA = seqRNA.substring(0,seqRNA.indexOf("UGA"));
        }
        if(seqRNA.indexOf("UAA") > 0)
        {
            seqRNA = seqRNA.substring(0,seqRNA.indexOf("UGA"));
        }
        if(seqRNA.indexOf("UAG") > 0)
        {
            seqRNA = seqRNA.substring(0,seqRNA.indexOf("UGA"));
        }
        
        //Translation
        for(int i = 0; i < seqRNA.length(); i=i+3)
        {
            String temp = "";
            temp = seqRNA.substring(i,i+3);
            System.out.print(codeSeq.get(temp) + " ");
        }

    }    
}

package day2;

public class ArrayPractice {
    public static void main(String[] args) {
        
        // Puanlarımızı bir dizi (Array) olarak tanımlıyoruz. (Süslü parantez kullanılır)
        int[] scores = {45, 82, 14, 96, 73, 55};
        
        // En büyük sayıyı bulmak için başlangıçta dizinin İLK elemanını "en büyük" kabul ediyoruz.
        int maxScore = scores[0];
        
        // Ortalama hesaplamak için tüm sayıların toplamını tutacağımız sepet.
        int sum = 0;

        // 1. ADIM: Döngü, dizinin eleman sayısı (uzunluğu) kadar dönmeli. 
        // İpucu: Java'da bir dizinin uzunluğu '.length' komutu ile bulunur.
        for (int i = 0; i < scores.length; i++) {
            
            // 2. ADIM: Her adımda, sıradaki puanı (yani scores[i]) 'sum' sepetine ekle.
            sum = sum + scores[i];

            // 3. ADIM: Eğer okuduğumuz sıradaki puan (scores[i]), elimizdeki maxScore'dan daha büyükse...
            if (scores[i] > maxScore) {
                // ...artık yeni en büyük puanımız o sıradaki puan olsun!
                maxScore = scores[i]; 
            }
        }

        // 4. ADIM: Ortalamayı bulmak için toplamı, dizinin eleman sayısına böl.
        int average = (int) sum / scores.length;

        System.out.println("Highest Score: " + maxScore);
        System.out.println("Average Score: " + average);
    }
}
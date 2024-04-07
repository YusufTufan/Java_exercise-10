# Calculate e Number
Bu Java programı, kullanıcının girdiği bir sayıya göre e sayısının değerini hesaplar. Euler sayısı olarak da bilinen e sayısı, sonsuz bir dizi olan ve matematikte önemli bir sabit olan bir reel sayıdır.

## Kullanım
Programı çalıştırmak için bir Java IDE'si kullanarak veya terminalde aşağıdaki adımları takip ederek çalıştırabilirsiniz:

1. Java derleyicisi ile `e_number.java` dosyasını derleyin:  
   ```
   javac e_number.java
   ```

2. Oluşturulan `.class` dosyasını çalıştırın:  
   ```
   java e_number
   ```

3. Program, bir sayı girmenizi isteyecek. Bir sayı girin ve program, bu sayıya göre e sayısının değerini hesaplayacaktır.

## E Sayısı Hesaplama
Program, kullanıcının girdiği sayıya göre e sayısını hesaplamak için aşağıdaki formülü kullanır:

```
e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/n!
```

Burada `n` kullanıcının girdiği sayıdır ve `n!` faktöriyel işlemini temsil eder.

## Notlar
- Program, kullanıcıdan girdi almak için `Scanner` sınıfını kullanır.
- Program, kullanıcının girdiği sayıya kadar olan faktöriyelleri hesaplayarak e sayısını hesaplar.
- Program, hesaplanan e sayısını ekrana yazdırır.

Bu README dosyası, programın nasıl çalıştırılacağını, e sayısının nasıl hesaplandığını, programın kullanımını ve diğer bazı bilgileri açıklar. Ayrıca, katkıları nasıl yapabileceğiniz hakkında bilgi verir ve projenin lisansını belirtir.

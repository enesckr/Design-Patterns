public class MSSQLMateryal implements IDBMateryal {

    @Override
    public void materyalEkle(IMateryal materyal) {
        System.out.println(materyal.getMateryalAdi() + " adli " + materyal.getMateryalTipi() + " tipindeki materyal bilgileri veritabanina kaydedilmistir.");
    }

    @Override
    public void materyalSil(IMateryal materyal) {
        System.out.println(materyal.getMateryalAdi() + " adli " + materyal.getMateryalTipi() + " tipindeki materyal bilgileri veritabanindan silinmiştir.");
    }

    @Override
    public void materyalAra(String materyalAdi) {
        System.out.println(materyalAdi + " adli materyal bilgileri veritabaninda araniyor.");
    }

}

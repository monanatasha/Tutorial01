/**
 * 
 * @author Mona Natasha
 * 1606874601
 * APAP - C
 *
 */

public class Dosen {
	public static String email;
	public static String nama;
	public static String id;
	
	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Dosen.email = email;
	}

	public static String getNama() {
		return nama;
	}

	public static void setNama(String nama) {
		Dosen.nama = nama;
	}

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		Dosen.id = id;
	}

	public Dosen() {
		this.email = email;
		this.nama = nama;
		this.id = id;
	}

}

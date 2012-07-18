package com.helloandroid;

import java.io.File;
import android.content.Context;
import android.database.sqlite.*;

public class DataProvider {
	
	
	private File dbFile;
	private SQLiteDatabase db;
	
	public DataProvider(Context con) {
		
		dbFile = new File(con.getExternalFilesDir(null), con.getString(R.string.db));
		System.out.println("well we're here " + con.getExternalFilesDir(null));
		
		
	}
	
	public void openDB() {
		
		db = SQLiteDatabase.openOrCreateDatabase(dbFile, null);
		System.out.println("Its open? "  + db.isOpen());
		
	}

	public void closeDB() {
		db.close();
	}
}

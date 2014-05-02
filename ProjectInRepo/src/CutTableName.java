
public class CutTableName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String TABLE_NAME_1 = "LOG_SESSION_ADAPTER";
		String type_1 = TABLE_NAME_1.substring(12);
		System.out.println(type_1);
		
		String TABLE_NAME_2 = "LOG_SESSION_LOADER";
		String type_2 = TABLE_NAME_2.substring(12);
		System.out.println(type_2);
		
		String TABLE_NAME_3 = "LOG_SESSION_AGGREGATOR";
		String type_3 = TABLE_NAME_3.substring(12);
		System.out.println(type_3);
		
		String type = type_1;
		
		final String defaultMessageLog = "MESSAGE LOG '${LOG_DIR}/iqloader/session/" + type + "/" + type + "_${DATE}_msg.log' \n";
		final String defaultRowLog = "ROW LOG '${REJECTED_DIR}/session/" + type + "/" + type + "_${DATE}_row.log' \n";
		
		System.out.println(defaultMessageLog);
		System.out.println(defaultRowLog);
		
		String tpName = "DWH_MONITOR";
		
		if (tpName == "DWH_MONITOR") {
			System.out.println("Done");
		}

	}

}

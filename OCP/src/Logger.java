
public class Logger {
	private ILogType log;

	public Logger(ILogType log) {
		super();
		this.log = log;
	}
	
	public void WriteLog() {
		this.log.write();
	}
}

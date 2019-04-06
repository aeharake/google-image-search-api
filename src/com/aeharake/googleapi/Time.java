package com.aeharake.googleapi;

import com.aeharake.googleapi.Tools.TimeConstants;
import com.aeharake.googleapi.Tools.ToolsBuilder;

public class Time {
	private String arg;

	public Time() {

	}

	public void setArg(String arg) {
		this.arg = arg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (arg != null ? arg : "");
	}

	public static class TimeBuilder {
		public Time time;
		private ToolsBuilder toolsBuilder;

		public TimeBuilder time() {
			return this;
		}

		public TimeBuilder(ToolsBuilder toolsBuilder) {
			this.toolsBuilder = toolsBuilder;
			time = new Time();
		}

		public ToolsBuilder last24Hours() {
			time.setArg(TimeConstants.LAST_24_HOURS);
			toolsBuilder.time(time);
			return toolsBuilder;
		}

		public ToolsBuilder lastHour() {
			time.setArg(TimeConstants.LAST_HOUR);
			toolsBuilder.time(time);
			return toolsBuilder;
		}

		public ToolsBuilder lastWeek() {
			time.setArg(TimeConstants.LAST_WEEK);
			toolsBuilder.time(time);
			return toolsBuilder;
		}

		public ToolsBuilder lastMonth() {
			time.setArg(TimeConstants.LAST_MONTH);
			toolsBuilder.time(time);
			return toolsBuilder;
		}

		public ToolsBuilder lastYear() {
			time.setArg(TimeConstants.LAST_YEAR);
			toolsBuilder.time(time);
			return toolsBuilder;
		}

		public Time builder() {
			return time;
		}

		public ToolsBuilder anytime() {
			time.setArg(TimeConstants.ANY_TIME);
			toolsBuilder.time(time);
			return toolsBuilder;
		}
	}
}

package com.aeharake.googleapi;

import com.aeharake.googleapi.Size.SizeBuilder;
import com.aeharake.googleapi.Time.TimeBuilder;

/**
 * @author Oliver
 *
 */
public class Tools {

	private Size size;
	private String type;
	private String color;
	private Time time;

	private Tools(ToolsBuilder builder) {
		size = builder.size;
		color = builder.color;
		type = builder.type;
		time = builder.time;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Size getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public Time getTime() {
		return time;
	}

	public String getType() {
		return type;
	}

	public String toString() {
		String result = "";
		if (size != null) {
			result += size.toString();
		}
		if (type != null) {
			result += ",";
			result += type.toString();
		}
		if (color != null) {
			result += ",";
			result += color.toString();
		}
		if (time != null) {
			result += ",";
			result += time.toString();
		}
		if (result.length() > 0)
			return "&tbs=" + result;
		return "";
	}

	public static class ToolsBuilder {
		private Size size;
		private String type;
		private String color;
		private Time time;

		public SizeBuilder size() {
			return new SizeBuilder(this);
		}

		protected ToolsBuilder size(Size size) {
			this.size = size;
			return this;
		}

		public ToolsBuilder type(String type) {
			this.type = type;
			return this;
		}

		public ToolsBuilder color(String color) {
			this.color = color;
			return this;
		}

		protected ToolsBuilder time(Time time) {
			this.time = time;
			return this;
		}

		/**
		 * 
		 * @param from
		 *            e.g 7/2/2018 where M/D/Y
		 * @param to
		 *            e.g 7/6/2018 where M/D/Y
		 * @return ToolsBuilder
		 */
		public ToolsBuilder time(String from, String to) {
			this.time.setArg(String.format(Tools.TimeConstants.CUSTOM_TIME, from, to));
			return this;
		}

		public TimeBuilder time() {
			return new TimeBuilder(this);
		}

		public Tools build() {
			return new Tools(this);
		}

	}

	public static class TimeConstants {
		public final static String LAST_24_HOURS = "qdr:d";
		public final static String LAST_HOUR = "qdr:h";
		public final static String LAST_WEEK = "qdr:w";
		public final static String LAST_MONTH = "qdr:m";
		public final static String LAST_YEAR = "qdr:y";
		public final static String CUSTOM_TIME = "cdr:1,cd_min:%s,cd_max:%s";
		public static final String ANY_TIME = "";
	}

	public static class TypeConstants {
		private final static String PRE = "itp:";
		public final static String FACE = PRE + "face";
		public final static String PHOTO = PRE + "photo";
		public final static String CLIP_ART = PRE + "clipart";
		public final static String LINE_DRAWING = PRE + "linedrawing";
		public final static String ANIMATED = PRE + "animated";
		public static final String ANY_TYPE = "";
	}

	public static class ColorConstants {
		public final static String ANY_COLOR = "";
		public final static String TRANSPARENT = "ic:trans";
		public final static String FULL_COLOR = "ic:color";
		public final static String BW = "ic:gray";
		public final static String RED = "ic:specific,isc:red";
		public final static String BLACK = "ic:specific,isc:black";
		public final static String BROWN = "ic:specific,isc:brown";
		public final static String WHITE = "ic:specific,isc:white";
		public final static String GRAY = "ic:specific,isc:gray";
		public final static String PURPLE = "ic:specific,isc:purple";
		public final static String GREEN = "ic:specific,isc:green";
		public final static String PINK = "ic:specific,isc:pink";
		public final static String ORANGE = "ic:specific,isc:orange";
		public final static String YELLOW = "ic:specific,isc:yellow";
		public final static String BLUE = "ic:specific,isc:blue";
		public final static String TEAL = "ic:specific,isc:teal";
	}

	public static class SizeConstants {
		public final static String ANY_SIZE = "";
		public final static String LARGE = "isz:l";
		public final static String MEDIUM = "isz:m";
		public final static String ICON = "isz:i";
		public final static String LT_400x200 = "isz:lt,islt:qsvga";
		public final static String LT_640x480 = "isz:lt,islt:vga";
		public final static String LT_800x600 = "isz:lt,islt:svga";
		public final static String LT_1024x768 = "isz:lt,islt:xga";
		public final static String LT_2MP = "isz:lt,islt:2mp";
		public final static String LT_4MP = "isz:lt,islt:4mp";
		public final static String LT_6MP = "isz:lt,islt:6mp";
		public final static String LT_8MP = "isz:lt,islt:8mp";
		public final static String LT_10MP = "isz:lt,islt:10mp";
		public final static String LT_12MP = "isz:lt,islt:12mp";
		public final static String LT_15MP = "isz:lt,islt:15mp";
		public final static String LT_20MP = "isz:lt,islt:20mp";
		public final static String LT_40MP = "isz:lt,islt:40mp";
		public final static String LT_70MP = "isz:lt,islt:70mp";
		public final static String EXACTLY = "isz:ex,iszw:%s,iszh:%s";
	}
	

}

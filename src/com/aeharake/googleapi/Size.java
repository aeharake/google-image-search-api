package com.aeharake.googleapi;

import com.aeharake.googleapi.Tools.ToolsBuilder;

/**
 * @author <b>Ahmad El Harake</b> <br>
 *         <i>Computer Engineer</i> <br>
 *         <b>email: </b>aeharake@gmail.com
 *
 */
public class Size {

	private String arg;

	public Size() {
		
	}

	public void setArg(String arg) {
		this.arg = arg;
	}

	@Override
	public String toString() {
		return (arg != null ? arg : "");
	}

	public static class SizeBuilder {
		private Size size;
		private ToolsBuilder toolsBuilder;

		public SizeBuilder(ToolsBuilder toolsBuilder) {
			this.toolsBuilder = toolsBuilder;
			size = new Size();
		}

		public SizeBuilder size() {
			return this;
		}

		public Size build() {
			return size;
		}

		/**
		 * 
		 * @param largerThan
		 *            a SizeContants constant string starting with LT_ from
		 *            Tools.SizeConstants
		 * @return am updated ToolsBuilder object.
		 */
		public ToolsBuilder largerThan(String largerThan) { // SizeConstants
			size.setArg(largerThan);
			ToolsBuilder builder = new Tools.ToolsBuilder();
			builder.size(size);
			return builder;
		}

		/**
		 * Search for exactly the size specified.
		 * 
		 * @param width
		 *            of the image.
		 * @param height
		 *            of the image.
		 * @return a ToolsBuilder object.
		 */
		public ToolsBuilder exactly(int width, int height) {
			String v = String.format(Tools.SizeConstants.EXACTLY, width + "", height + "");
			size.setArg(v);
			toolsBuilder.size(size);
			return toolsBuilder;
		}

		/**
		 * Search for large image sizes.
		 * 
		 * @return a ToolsBuilder object.
		 */
		public ToolsBuilder large() {
			size.setArg(Tools.SizeConstants.LARGE);
			toolsBuilder.size(size);
			return toolsBuilder;
		}

		/**
		 * Search for medium image sizes.
		 * 
		 * @return a ToolsBuilder object.
		 */
		public ToolsBuilder medium() {
			size.setArg(Tools.SizeConstants.MEDIUM);
			toolsBuilder.size(size);
			return toolsBuilder;
		}

		/**
		 * Search for icon image sizes.
		 * 
		 * @return
		 */
		public ToolsBuilder icon() {
			size.setArg(Tools.SizeConstants.ICON);
			toolsBuilder.size(size);
			return toolsBuilder;
		}

		public ToolsBuilder anySize() {
			size.setArg("");
			toolsBuilder.size(size);
			return toolsBuilder;
		}
	}

}

/**
* BigBlueButton open source conferencing system - http://www.bigbluebutton.org/
*
* Copyright (c) 2008 by respective authors (see below).
*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License as published by the Free Software
* Foundation; either version 2.1 of the License, or (at your option) any later
* version.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
* PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License along
* with this program; if not, write to the Free Software Foundation, Inc.,
* 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
* 
*/

package org.bigbluebutton.fileupload.document;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.bigbluebutton.fileupload.SlideDescriptor;
import org.springframework.web.multipart.MultipartFile;
// TODO: Auto-generated Javadoc

/**
 * The Interface ISlideManager.
 * 
 * @author ritzalam
 */
public interface ISlideManager {
	
	/**
	 * Gets the images.
	 * 
	 * @param sourceFolder the source folder
	 * 
	 * @return the images
	 */
	public List<SlideDescriptor> getImages(String sourceFolder);
	
	/**
	 * Save image.
	 * 
	 * @param file the file
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void saveImage(File file) throws IOException;
	
	/**
	 * Save image.
	 * 
	 * @param multipartFile the multipart file
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void saveImage(MultipartFile multipartFile) throws IOException; 
	
	/**
	 * Save file.
	 * 
	 * @param stream the stream
	 * @param dir the dir
	 * @param filename the filename
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void saveFile(InputStream stream, String dir, String filename) throws IOException;
	
	/**
	 * Stream image.
	 * 
	 * @param name the name
	 * @param os the os
	 */
	public void streamImage(String name, OutputStream os);
}
 
/*
 * File:    $HeadURL$
 * Version: $LastChangedRevision$
 * Date:    $Date$
 * Author:  $LastChangedBy$
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2008 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package org.jvoicexml.implementation.mobicents;

import java.io.IOException;

/**
 * Facility to support audio streaming to any
 * {@link org.jvoicexml.implementation.Telephony} that can handle streams.
 *
 * @author Dirk Schnell
 * @version $Revision$
 * @since 0.6
 *
 * <p>
 * Copyright &copy; 2008 JVoiceXML group - <a
 * href="http://jvoicexml.sourceforge.net">http://jvoicexml.sourceforge.net/
 * </a>
 * </p>
 */

public interface StreamableSynthesizedOutput {
    /**
     * Reads up to <code>length</code> bytes of data from the synthesizer
     * stream into the given buffer.
     * @param buffer the buffer into which the data is read.
     * @param offset the start offset in array <code>buffer</code> at which the
     *        data is written.
     * @param length the maximum number of bytes to read.
     * @return the total number of bytes read into the buffer, or
     * <code>-1</code> if there is no more data because the end of the stream
     * has been reached.
     *
     * @exception IOException
     *            Error reading from the stream..
     */
    int readSynthesizerStream(final byte[] buffer, final int offset,
            final int length) throws IOException;
}

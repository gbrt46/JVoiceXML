/*
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2005-2017 JVoiceXML group
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Library General Public
 *  License as published by the Free Software Foundation; either
 *  version 2 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Library General Public License for more details.
 *
 *  You should have received a copy of the GNU Library General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package org.jvoicexml.interpreter.formitem;

import org.jvoicexml.event.JVoiceXMLEvent;
import org.jvoicexml.interpreter.FormItemVisitor;
import org.jvoicexml.interpreter.VoiceXmlInterpreterContext;
import org.jvoicexml.xml.VoiceXmlNode;
import org.jvoicexml.xml.vxml.Record;

/**
 * An input item whose value is an audio clip recorded by the user. A
 * <code>&lt;record&gt;</code> element could collect a voice mail message, for
 * instance.
 *
 * @author Dirk Schnelle-Walka
 */
public final class RecordFormItem
        extends AbstractGrammarContainer {
    /**
     * Constructs a new object as a template.
     */
    public RecordFormItem() {
    }

    /**
     * Create a new record input item.
     *
     * @param context
     *        The current <code>VoiceXmlInterpreterContext</code>.
     * @param voiceNode
     *        The corresponding xml node in the VoiceXML document.
     * @throws IllegalArgumentException
     *         if the given node is not a {@link Record}
     */
    public RecordFormItem(final VoiceXmlInterpreterContext context,
                         final VoiceXmlNode voiceNode)
                                 throws IllegalArgumentException {
        super(context, voiceNode);
        if (!(voiceNode instanceof Record)) {
            throw new IllegalArgumentException("Node must be a <record>");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbstractFormItem newInstance(
            final VoiceXmlInterpreterContext ctx,
            final VoiceXmlNode voiceNode) {
        return new RecordFormItem(ctx, voiceNode);
    }

    /**
     * Gets the record belonging to this {@link RecordFormItem}.
     *
     * @return The related record or <code>null</code> if there is no record.
     */
    private Record getRecord() {
        final VoiceXmlNode node = getNode();
        if (node == null) {
            return null;
        }
        return (Record) node;
    }

    /**
     * {@inheritDoc}
     */
    public void accept(final FormItemVisitor visitor)
            throws JVoiceXMLEvent {
        visitor.visitRecordFormItem(this);
    }

    /**
     * Retrieves the record's maxtime attribute as msec.
     * @return number of milliseconds, <code>-1</code> if the value can not
     *         be converted to a number.
     */
    public long getMaxtime() {
        final Record record = getRecord();
        if (record == null) {
            return -1;
        }

        return record.getMaxtimeAsMsec();
    }

    /**
     * {@inheritDoc}
     */
    public boolean isModal() {
        final Record record = getRecord();
        if (record == null) {
            return false;
        }

        return record.isModal();
    }
}

// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;
import java.util.Arrays;

class OFPacketInVer11 implements OFPacketIn {
    private static final Logger logger = LoggerFactory.getLogger(OFPacketInVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int MINIMUM_LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFBufferId DEFAULT_BUFFER_ID = OFBufferId.NO_BUFFER;
        private final static OFPort DEFAULT_IN_PORT = OFPort.ANY;
        private final static OFPort DEFAULT_IN_PHY_PORT = OFPort.ANY;
        private final static int DEFAULT_TOTAL_LEN = 0x0;
        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static byte[] DEFAULT_DATA = new byte[0];

    // OF message fields
    private final long xid;
    private final OFBufferId bufferId;
    private final OFPort inPort;
    private final OFPort inPhyPort;
    private final int totalLen;
    private final OFPacketInReason reason;
    private final TableId tableId;
    private final byte[] data;
//

    // package private constructor - used by readers, builders, and factory
    OFPacketInVer11(long xid, OFBufferId bufferId, OFPort inPort, OFPort inPhyPort, int totalLen, OFPacketInReason reason, TableId tableId, byte[] data) {
        this.xid = xid;
        this.bufferId = bufferId;
        this.inPort = inPort;
        this.inPhyPort = inPhyPort;
        this.totalLen = totalLen;
        this.reason = reason;
        this.tableId = tableId;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.PACKET_IN;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public int getTotalLen() {
        return totalLen;
    }

    @Override
    public OFPacketInReason getReason() {
        return reason;
    }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public Match getMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property match not supported in version 1.1");
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFPort getInPort() {
        return inPort;
    }

    @Override
    public OFPort getInPhyPort() {
        return inPhyPort;
    }

    @Override
    public U64 getCookie()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookie not supported in version 1.1");
    }



    public OFPacketIn.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPacketIn.Builder {
        final OFPacketInVer11 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean bufferIdSet;
        private OFBufferId bufferId;
        private boolean inPortSet;
        private OFPort inPort;
        private boolean inPhyPortSet;
        private OFPort inPhyPort;
        private boolean totalLenSet;
        private int totalLen;
        private boolean reasonSet;
        private OFPacketInReason reason;
        private boolean tableIdSet;
        private TableId tableId;
        private boolean dataSet;
        private byte[] data;

        BuilderWithParent(OFPacketInVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.PACKET_IN;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPacketIn.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public OFPacketIn.Builder setBufferId(OFBufferId bufferId) {
        this.bufferId = bufferId;
        this.bufferIdSet = true;
        return this;
    }
    @Override
    public int getTotalLen() {
        return totalLen;
    }

    @Override
    public OFPacketIn.Builder setTotalLen(int totalLen) {
        this.totalLen = totalLen;
        this.totalLenSet = true;
        return this;
    }
    @Override
    public OFPacketInReason getReason() {
        return reason;
    }

    @Override
    public OFPacketIn.Builder setReason(OFPacketInReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFPacketIn.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Match getMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property match not supported in version 1.1");
    }

    @Override
    public OFPacketIn.Builder setMatch(Match match) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property match not supported in version 1.1");
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFPacketIn.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
    @Override
    public OFPort getInPort() {
        return inPort;
    }

    @Override
    public OFPacketIn.Builder setInPort(OFPort inPort) {
        this.inPort = inPort;
        this.inPortSet = true;
        return this;
    }
    @Override
    public OFPort getInPhyPort() {
        return inPhyPort;
    }

    @Override
    public OFPacketIn.Builder setInPhyPort(OFPort inPhyPort) {
        this.inPhyPort = inPhyPort;
        this.inPhyPortSet = true;
        return this;
    }
    @Override
    public U64 getCookie()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookie not supported in version 1.1");
    }

    @Override
    public OFPacketIn.Builder setCookie(U64 cookie) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property cookie not supported in version 1.1");
    }


        @Override
        public OFPacketIn build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFBufferId bufferId = this.bufferIdSet ? this.bufferId : parentMessage.bufferId;
                if(bufferId == null)
                    throw new NullPointerException("Property bufferId must not be null");
                OFPort inPort = this.inPortSet ? this.inPort : parentMessage.inPort;
                if(inPort == null)
                    throw new NullPointerException("Property inPort must not be null");
                OFPort inPhyPort = this.inPhyPortSet ? this.inPhyPort : parentMessage.inPhyPort;
                if(inPhyPort == null)
                    throw new NullPointerException("Property inPhyPort must not be null");
                int totalLen = this.totalLenSet ? this.totalLen : parentMessage.totalLen;
                OFPacketInReason reason = this.reasonSet ? this.reason : parentMessage.reason;
                if(reason == null)
                    throw new NullPointerException("Property reason must not be null");
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                byte[] data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFPacketInVer11(
                    xid,
                    bufferId,
                    inPort,
                    inPhyPort,
                    totalLen,
                    reason,
                    tableId,
                    data
                );
        }

    }

    static class Builder implements OFPacketIn.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean bufferIdSet;
        private OFBufferId bufferId;
        private boolean inPortSet;
        private OFPort inPort;
        private boolean inPhyPortSet;
        private OFPort inPhyPort;
        private boolean totalLenSet;
        private int totalLen;
        private boolean reasonSet;
        private OFPacketInReason reason;
        private boolean tableIdSet;
        private TableId tableId;
        private boolean dataSet;
        private byte[] data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.PACKET_IN;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPacketIn.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public OFPacketIn.Builder setBufferId(OFBufferId bufferId) {
        this.bufferId = bufferId;
        this.bufferIdSet = true;
        return this;
    }
    @Override
    public int getTotalLen() {
        return totalLen;
    }

    @Override
    public OFPacketIn.Builder setTotalLen(int totalLen) {
        this.totalLen = totalLen;
        this.totalLenSet = true;
        return this;
    }
    @Override
    public OFPacketInReason getReason() {
        return reason;
    }

    @Override
    public OFPacketIn.Builder setReason(OFPacketInReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFPacketIn.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Match getMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property match not supported in version 1.1");
    }

    @Override
    public OFPacketIn.Builder setMatch(Match match) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property match not supported in version 1.1");
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFPacketIn.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
    @Override
    public OFPort getInPort() {
        return inPort;
    }

    @Override
    public OFPacketIn.Builder setInPort(OFPort inPort) {
        this.inPort = inPort;
        this.inPortSet = true;
        return this;
    }
    @Override
    public OFPort getInPhyPort() {
        return inPhyPort;
    }

    @Override
    public OFPacketIn.Builder setInPhyPort(OFPort inPhyPort) {
        this.inPhyPort = inPhyPort;
        this.inPhyPortSet = true;
        return this;
    }
    @Override
    public U64 getCookie()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookie not supported in version 1.1");
    }

    @Override
    public OFPacketIn.Builder setCookie(U64 cookie) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property cookie not supported in version 1.1");
    }
//
        @Override
        public OFPacketIn build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            OFBufferId bufferId = this.bufferIdSet ? this.bufferId : DEFAULT_BUFFER_ID;
            if(bufferId == null)
                throw new NullPointerException("Property bufferId must not be null");
            OFPort inPort = this.inPortSet ? this.inPort : DEFAULT_IN_PORT;
            if(inPort == null)
                throw new NullPointerException("Property inPort must not be null");
            OFPort inPhyPort = this.inPhyPortSet ? this.inPhyPort : DEFAULT_IN_PHY_PORT;
            if(inPhyPort == null)
                throw new NullPointerException("Property inPhyPort must not be null");
            int totalLen = this.totalLenSet ? this.totalLen : DEFAULT_TOTAL_LEN;
            if(!this.reasonSet)
                throw new IllegalStateException("Property reason doesn't have default value -- must be set");
            if(reason == null)
                throw new NullPointerException("Property reason must not be null");
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            byte[] data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFPacketInVer11(
                    xid,
                    bufferId,
                    inPort,
                    inPhyPort,
                    totalLen,
                    reason,
                    tableId,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPacketIn> {
        @Override
        public OFPacketIn readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 2
            byte version = bb.readByte();
            if(version != (byte) 0x2)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_11(2), got="+version);
            // fixed value property type == 10
            byte type = bb.readByte();
            if(type != (byte) 0xa)
                throw new OFParseError("Wrong type: Expected=OFType.PACKET_IN(10), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            OFBufferId bufferId = OFBufferId.of(bb.readInt());
            OFPort inPort = OFPort.read4Bytes(bb);
            OFPort inPhyPort = OFPort.read4Bytes(bb);
            int totalLen = U16.f(bb.readShort());
            OFPacketInReason reason = OFPacketInReasonSerializerVer11.readFrom(bb);
            TableId tableId = TableId.readByte(bb);
            byte[] data = ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));

            OFPacketInVer11 packetInVer11 = new OFPacketInVer11(
                    xid,
                      bufferId,
                      inPort,
                      inPhyPort,
                      totalLen,
                      reason,
                      tableId,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", packetInVer11);
            return packetInVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPacketInVer11Funnel FUNNEL = new OFPacketInVer11Funnel();
    static class OFPacketInVer11Funnel implements Funnel<OFPacketInVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPacketInVer11 message, PrimitiveSink sink) {
            // fixed value property version = 2
            sink.putByte((byte) 0x2);
            // fixed value property type = 10
            sink.putByte((byte) 0xa);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            message.bufferId.putTo(sink);
            message.inPort.putTo(sink);
            message.inPhyPort.putTo(sink);
            sink.putInt(message.totalLen);
            OFPacketInReasonSerializerVer11.putTo(message.reason, sink);
            message.tableId.putTo(sink);
            sink.putBytes(message.data);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPacketInVer11> {
        @Override
        public void write(ChannelBuffer bb, OFPacketInVer11 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 2
            bb.writeByte((byte) 0x2);
            // fixed value property type = 10
            bb.writeByte((byte) 0xa);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            bb.writeInt(message.bufferId.getInt());
            message.inPort.write4Bytes(bb);
            message.inPhyPort.write4Bytes(bb);
            bb.writeShort(U16.t(message.totalLen));
            OFPacketInReasonSerializerVer11.writeTo(bb, message.reason);
            message.tableId.writeByte(bb);
            bb.writeBytes(message.data);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPacketInVer11(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("bufferId=").append(bufferId);
        b.append(", ");
        b.append("inPort=").append(inPort);
        b.append(", ");
        b.append("inPhyPort=").append(inPhyPort);
        b.append(", ");
        b.append("totalLen=").append(totalLen);
        b.append(", ");
        b.append("reason=").append(reason);
        b.append(", ");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("data=").append(Arrays.toString(data));
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFPacketInVer11 other = (OFPacketInVer11) obj;

        if( xid != other.xid)
            return false;
        if (bufferId == null) {
            if (other.bufferId != null)
                return false;
        } else if (!bufferId.equals(other.bufferId))
            return false;
        if (inPort == null) {
            if (other.inPort != null)
                return false;
        } else if (!inPort.equals(other.inPort))
            return false;
        if (inPhyPort == null) {
            if (other.inPhyPort != null)
                return false;
        } else if (!inPhyPort.equals(other.inPhyPort))
            return false;
        if( totalLen != other.totalLen)
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (!Arrays.equals(data, other.data))
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((bufferId == null) ? 0 : bufferId.hashCode());
        result = prime * result + ((inPort == null) ? 0 : inPort.hashCode());
        result = prime * result + ((inPhyPort == null) ? 0 : inPhyPort.hashCode());
        result = prime * result + totalLen;
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

}

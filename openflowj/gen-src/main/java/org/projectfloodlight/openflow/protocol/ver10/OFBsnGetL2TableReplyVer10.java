// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnGetL2TableReplyVer10 implements OFBsnGetL2TableReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGetL2TableReplyVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static short DEFAULT_L2_TABLE_ENABLE = (short) 0x0;
        private final static int DEFAULT_L2_TABLE_PRIORITY = 0x0;

    // OF message fields
    private final long xid;
    private final short l2TableEnable;
    private final int l2TablePriority;
//
    // Immutable default instance
    final static OFBsnGetL2TableReplyVer10 DEFAULT = new OFBsnGetL2TableReplyVer10(
        DEFAULT_XID, DEFAULT_L2_TABLE_ENABLE, DEFAULT_L2_TABLE_PRIORITY
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnGetL2TableReplyVer10(long xid, short l2TableEnable, int l2TablePriority) {
        this.xid = xid;
        this.l2TableEnable = l2TableEnable;
        this.l2TablePriority = l2TablePriority;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xeL;
    }

    @Override
    public short getL2TableEnable() {
        return l2TableEnable;
    }

    @Override
    public int getL2TablePriority() {
        return l2TablePriority;
    }



    public OFBsnGetL2TableReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGetL2TableReply.Builder {
        final OFBsnGetL2TableReplyVer10 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean l2TableEnableSet;
        private short l2TableEnable;
        private boolean l2TablePrioritySet;
        private int l2TablePriority;

        BuilderWithParent(OFBsnGetL2TableReplyVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGetL2TableReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xeL;
    }

    @Override
    public short getL2TableEnable() {
        return l2TableEnable;
    }

    @Override
    public OFBsnGetL2TableReply.Builder setL2TableEnable(short l2TableEnable) {
        this.l2TableEnable = l2TableEnable;
        this.l2TableEnableSet = true;
        return this;
    }
    @Override
    public int getL2TablePriority() {
        return l2TablePriority;
    }

    @Override
    public OFBsnGetL2TableReply.Builder setL2TablePriority(int l2TablePriority) {
        this.l2TablePriority = l2TablePriority;
        this.l2TablePrioritySet = true;
        return this;
    }


        @Override
        public OFBsnGetL2TableReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                short l2TableEnable = this.l2TableEnableSet ? this.l2TableEnable : parentMessage.l2TableEnable;
                int l2TablePriority = this.l2TablePrioritySet ? this.l2TablePriority : parentMessage.l2TablePriority;

                //
                return new OFBsnGetL2TableReplyVer10(
                    xid,
                    l2TableEnable,
                    l2TablePriority
                );
        }

    }

    static class Builder implements OFBsnGetL2TableReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean l2TableEnableSet;
        private short l2TableEnable;
        private boolean l2TablePrioritySet;
        private int l2TablePriority;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGetL2TableReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0xeL;
    }

    @Override
    public short getL2TableEnable() {
        return l2TableEnable;
    }

    @Override
    public OFBsnGetL2TableReply.Builder setL2TableEnable(short l2TableEnable) {
        this.l2TableEnable = l2TableEnable;
        this.l2TableEnableSet = true;
        return this;
    }
    @Override
    public int getL2TablePriority() {
        return l2TablePriority;
    }

    @Override
    public OFBsnGetL2TableReply.Builder setL2TablePriority(int l2TablePriority) {
        this.l2TablePriority = l2TablePriority;
        this.l2TablePrioritySet = true;
        return this;
    }
//
        @Override
        public OFBsnGetL2TableReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            short l2TableEnable = this.l2TableEnableSet ? this.l2TableEnable : DEFAULT_L2_TABLE_ENABLE;
            int l2TablePriority = this.l2TablePrioritySet ? this.l2TablePriority : DEFAULT_L2_TABLE_PRIORITY;


            return new OFBsnGetL2TableReplyVer10(
                    xid,
                    l2TableEnable,
                    l2TablePriority
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGetL2TableReply> {
        @Override
        public OFBsnGetL2TableReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 24)
                throw new OFParseError("Wrong length: Expected=24(24), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0xeL
            int subtype = bb.readInt();
            if(subtype != 0xe)
                throw new OFParseError("Wrong subtype: Expected=0xeL(0xeL), got="+subtype);
            short l2TableEnable = U8.f(bb.readByte());
            // pad: 1 bytes
            bb.skipBytes(1);
            int l2TablePriority = U16.f(bb.readShort());
            // pad: 4 bytes
            bb.skipBytes(4);

            OFBsnGetL2TableReplyVer10 bsnGetL2TableReplyVer10 = new OFBsnGetL2TableReplyVer10(
                    xid,
                      l2TableEnable,
                      l2TablePriority
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGetL2TableReplyVer10);
            return bsnGetL2TableReplyVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGetL2TableReplyVer10Funnel FUNNEL = new OFBsnGetL2TableReplyVer10Funnel();
    static class OFBsnGetL2TableReplyVer10Funnel implements Funnel<OFBsnGetL2TableReplyVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGetL2TableReplyVer10 message, PrimitiveSink sink) {
            // fixed value property version = 1
            sink.putByte((byte) 0x1);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 24
            sink.putShort((short) 0x18);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0xeL
            sink.putInt(0xe);
            sink.putShort(message.l2TableEnable);
            // skip pad (1 bytes)
            sink.putInt(message.l2TablePriority);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGetL2TableReplyVer10> {
        @Override
        public void write(ByteBuf bb, OFBsnGetL2TableReplyVer10 message) {
            // fixed value property version = 1
            bb.writeByte((byte) 0x1);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 24
            bb.writeShort((short) 0x18);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0xeL
            bb.writeInt(0xe);
            bb.writeByte(U8.t(message.l2TableEnable));
            // pad: 1 bytes
            bb.writeZero(1);
            bb.writeShort(U16.t(message.l2TablePriority));
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGetL2TableReplyVer10(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("l2TableEnable=").append(l2TableEnable);
        b.append(", ");
        b.append("l2TablePriority=").append(l2TablePriority);
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
        OFBsnGetL2TableReplyVer10 other = (OFBsnGetL2TableReplyVer10) obj;

        if( xid != other.xid)
            return false;
        if( l2TableEnable != other.l2TableEnable)
            return false;
        if( l2TablePriority != other.l2TablePriority)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + l2TableEnable;
        result = prime * result + l2TablePriority;
        return result;
    }

}

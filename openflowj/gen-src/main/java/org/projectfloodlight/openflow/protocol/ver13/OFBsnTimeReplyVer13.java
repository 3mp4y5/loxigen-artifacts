// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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

class OFBsnTimeReplyVer13 implements OFBsnTimeReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTimeReplyVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static U64 DEFAULT_TIME_MS = U64.ZERO;

    // OF message fields
    private final long xid;
    private final U64 timeMs;
//
    // Immutable default instance
    final static OFBsnTimeReplyVer13 DEFAULT = new OFBsnTimeReplyVer13(
        DEFAULT_XID, DEFAULT_TIME_MS
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTimeReplyVer13(long xid, U64 timeMs) {
        if(timeMs == null) {
            throw new NullPointerException("OFBsnTimeReplyVer13: property timeMs cannot be null");
        }
        this.xid = xid;
        this.timeMs = timeMs;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
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
        return 0x2dL;
    }

    @Override
    public U64 getTimeMs() {
        return timeMs;
    }



    public OFBsnTimeReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTimeReply.Builder {
        final OFBsnTimeReplyVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean timeMsSet;
        private U64 timeMs;

        BuilderWithParent(OFBsnTimeReplyVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
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
    public OFBsnTimeReply.Builder setXid(long xid) {
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
        return 0x2dL;
    }

    @Override
    public U64 getTimeMs() {
        return timeMs;
    }

    @Override
    public OFBsnTimeReply.Builder setTimeMs(U64 timeMs) {
        this.timeMs = timeMs;
        this.timeMsSet = true;
        return this;
    }


        @Override
        public OFBsnTimeReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                U64 timeMs = this.timeMsSet ? this.timeMs : parentMessage.timeMs;
                if(timeMs == null)
                    throw new NullPointerException("Property timeMs must not be null");

                //
                return new OFBsnTimeReplyVer13(
                    xid,
                    timeMs
                );
        }

    }

    static class Builder implements OFBsnTimeReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean timeMsSet;
        private U64 timeMs;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
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
    public OFBsnTimeReply.Builder setXid(long xid) {
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
        return 0x2dL;
    }

    @Override
    public U64 getTimeMs() {
        return timeMs;
    }

    @Override
    public OFBsnTimeReply.Builder setTimeMs(U64 timeMs) {
        this.timeMs = timeMs;
        this.timeMsSet = true;
        return this;
    }
//
        @Override
        public OFBsnTimeReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            U64 timeMs = this.timeMsSet ? this.timeMs : DEFAULT_TIME_MS;
            if(timeMs == null)
                throw new NullPointerException("Property timeMs must not be null");


            return new OFBsnTimeReplyVer13(
                    xid,
                    timeMs
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTimeReply> {
        @Override
        public OFBsnTimeReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
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
            // fixed value property subtype == 0x2dL
            int subtype = bb.readInt();
            if(subtype != 0x2d)
                throw new OFParseError("Wrong subtype: Expected=0x2dL(0x2dL), got="+subtype);
            U64 timeMs = U64.ofRaw(bb.readLong());

            OFBsnTimeReplyVer13 bsnTimeReplyVer13 = new OFBsnTimeReplyVer13(
                    xid,
                      timeMs
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTimeReplyVer13);
            return bsnTimeReplyVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTimeReplyVer13Funnel FUNNEL = new OFBsnTimeReplyVer13Funnel();
    static class OFBsnTimeReplyVer13Funnel implements Funnel<OFBsnTimeReplyVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTimeReplyVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 24
            sink.putShort((short) 0x18);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x2dL
            sink.putInt(0x2d);
            message.timeMs.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTimeReplyVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTimeReplyVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 24
            bb.writeShort((short) 0x18);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x2dL
            bb.writeInt(0x2d);
            bb.writeLong(message.timeMs.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTimeReplyVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("timeMs=").append(timeMs);
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
        OFBsnTimeReplyVer13 other = (OFBsnTimeReplyVer13) obj;

        if( xid != other.xid)
            return false;
        if (timeMs == null) {
            if (other.timeMs != null)
                return false;
        } else if (!timeMs.equals(other.timeMs))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((timeMs == null) ? 0 : timeMs.hashCode());
        return result;
    }

}

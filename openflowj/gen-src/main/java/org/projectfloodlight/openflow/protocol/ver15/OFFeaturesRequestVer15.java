// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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

class OFFeaturesRequestVer15 implements OFFeaturesRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFFeaturesRequestVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 8;

        private final static long DEFAULT_XID = 0x0L;

    // OF message fields
    private final long xid;
//
    // Immutable default instance
    final static OFFeaturesRequestVer15 DEFAULT = new OFFeaturesRequestVer15(
        DEFAULT_XID
    );

    // package private constructor - used by readers, builders, and factory
    OFFeaturesRequestVer15(long xid) {
        this.xid = xid;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }



    public OFFeaturesRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFFeaturesRequest.Builder {
        final OFFeaturesRequestVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;

        BuilderWithParent(OFFeaturesRequestVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFeaturesRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }


        @Override
        public OFFeaturesRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;

                //
                return new OFFeaturesRequestVer15(
                    xid
                );
        }

    }

    static class Builder implements OFFeaturesRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.FEATURES_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFeaturesRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
//
        @Override
        public OFFeaturesRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;


            return new OFFeaturesRequestVer15(
                    xid
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFFeaturesRequest> {
        @Override
        public OFFeaturesRequest readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 5
            byte type = bb.readByte();
            if(type != (byte) 0x5)
                throw new OFParseError("Wrong type: Expected=OFType.FEATURES_REQUEST(5), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());

            OFFeaturesRequestVer15 featuresRequestVer15 = new OFFeaturesRequestVer15(
                    xid
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", featuresRequestVer15);
            return featuresRequestVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFFeaturesRequestVer15Funnel FUNNEL = new OFFeaturesRequestVer15Funnel();
    static class OFFeaturesRequestVer15Funnel implements Funnel<OFFeaturesRequestVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFFeaturesRequestVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 5
            sink.putByte((byte) 0x5);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.xid);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFFeaturesRequestVer15> {
        @Override
        public void write(ByteBuf bb, OFFeaturesRequestVer15 message) {
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 5
            bb.writeByte((byte) 0x5);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.xid));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFFeaturesRequestVer15(");
        b.append("xid=").append(xid);
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
        OFFeaturesRequestVer15 other = (OFFeaturesRequestVer15) obj;

        if( xid != other.xid)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        return result;
    }

}

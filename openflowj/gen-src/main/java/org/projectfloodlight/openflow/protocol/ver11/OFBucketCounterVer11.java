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

class OFBucketCounterVer11 implements OFBucketCounter {
    private static final Logger logger = LoggerFactory.getLogger(OFBucketCounterVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 16;

        private final static U64 DEFAULT_PACKET_COUNT = U64.ZERO;
        private final static U64 DEFAULT_BYTE_COUNT = U64.ZERO;

    // OF message fields
    private final U64 packetCount;
    private final U64 byteCount;
//
    // Immutable default instance
    final static OFBucketCounterVer11 DEFAULT = new OFBucketCounterVer11(
        DEFAULT_PACKET_COUNT, DEFAULT_BYTE_COUNT
    );

    // package private constructor - used by readers, builders, and factory
    OFBucketCounterVer11(U64 packetCount, U64 byteCount) {
        if(packetCount == null) {
            throw new NullPointerException("OFBucketCounterVer11: property packetCount cannot be null");
        }
        if(byteCount == null) {
            throw new NullPointerException("OFBucketCounterVer11: property byteCount cannot be null");
        }
        this.packetCount = packetCount;
        this.byteCount = byteCount;
    }

    // Accessors for OF message fields
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFBucketCounter.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBucketCounter.Builder {
        final OFBucketCounterVer11 parentMessage;

        // OF message fields
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;

        BuilderWithParent(OFBucketCounterVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFBucketCounter.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFBucketCounter.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFBucketCounter build() {
                U64 packetCount = this.packetCountSet ? this.packetCount : parentMessage.packetCount;
                if(packetCount == null)
                    throw new NullPointerException("Property packetCount must not be null");
                U64 byteCount = this.byteCountSet ? this.byteCount : parentMessage.byteCount;
                if(byteCount == null)
                    throw new NullPointerException("Property byteCount must not be null");

                //
                return new OFBucketCounterVer11(
                    packetCount,
                    byteCount
                );
        }

    }

    static class Builder implements OFBucketCounter.Builder {
        // OF message fields
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;

    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFBucketCounter.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFBucketCounter.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFBucketCounter build() {
            U64 packetCount = this.packetCountSet ? this.packetCount : DEFAULT_PACKET_COUNT;
            if(packetCount == null)
                throw new NullPointerException("Property packetCount must not be null");
            U64 byteCount = this.byteCountSet ? this.byteCount : DEFAULT_BYTE_COUNT;
            if(byteCount == null)
                throw new NullPointerException("Property byteCount must not be null");


            return new OFBucketCounterVer11(
                    packetCount,
                    byteCount
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBucketCounter> {
        @Override
        public OFBucketCounter readFrom(ByteBuf bb) throws OFParseError {
            U64 packetCount = U64.ofRaw(bb.readLong());
            U64 byteCount = U64.ofRaw(bb.readLong());

            OFBucketCounterVer11 bucketCounterVer11 = new OFBucketCounterVer11(
                    packetCount,
                      byteCount
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bucketCounterVer11);
            return bucketCounterVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBucketCounterVer11Funnel FUNNEL = new OFBucketCounterVer11Funnel();
    static class OFBucketCounterVer11Funnel implements Funnel<OFBucketCounterVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBucketCounterVer11 message, PrimitiveSink sink) {
            message.packetCount.putTo(sink);
            message.byteCount.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBucketCounterVer11> {
        @Override
        public void write(ByteBuf bb, OFBucketCounterVer11 message) {
            bb.writeLong(message.packetCount.getValue());
            bb.writeLong(message.byteCount.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBucketCounterVer11(");
        b.append("packetCount=").append(packetCount);
        b.append(", ");
        b.append("byteCount=").append(byteCount);
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
        OFBucketCounterVer11 other = (OFBucketCounterVer11) obj;

        if (packetCount == null) {
            if (other.packetCount != null)
                return false;
        } else if (!packetCount.equals(other.packetCount))
            return false;
        if (byteCount == null) {
            if (other.byteCount != null)
                return false;
        } else if (!byteCount.equals(other.byteCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((packetCount == null) ? 0 : packetCount.hashCode());
        result = prime * result + ((byteCount == null) ? 0 : byteCount.hashCode());
        return result;
    }

}

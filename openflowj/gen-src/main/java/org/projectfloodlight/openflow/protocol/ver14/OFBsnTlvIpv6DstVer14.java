// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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

class OFBsnTlvIpv6DstVer14 implements OFBsnTlvIpv6Dst {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIpv6DstVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 20;

        private final static IPv6Address DEFAULT_VALUE = IPv6Address.NONE;

    // OF message fields
    private final IPv6Address value;
//
    // Immutable default instance
    final static OFBsnTlvIpv6DstVer14 DEFAULT = new OFBsnTlvIpv6DstVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIpv6DstVer14(IPv6Address value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvIpv6DstVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x7f;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvIpv6Dst.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIpv6Dst.Builder {
        final OFBsnTlvIpv6DstVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv6Address value;

        BuilderWithParent(OFBsnTlvIpv6DstVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x7f;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv6Dst.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvIpv6Dst build() {
                IPv6Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvIpv6DstVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvIpv6Dst.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv6Address value;

    @Override
    public int getType() {
        return 0x7f;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv6Dst.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnTlvIpv6Dst build() {
            IPv6Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvIpv6DstVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvIpv6Dst> {
        @Override
        public OFBsnTlvIpv6Dst readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x7f
            short type = bb.readShort();
            if(type != (short) 0x7f)
                throw new OFParseError("Wrong type: Expected=0x7f(0x7f), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 20)
                throw new OFParseError("Wrong length: Expected=20(20), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            IPv6Address value = IPv6Address.read16Bytes(bb);

            OFBsnTlvIpv6DstVer14 bsnTlvIpv6DstVer14 = new OFBsnTlvIpv6DstVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIpv6DstVer14);
            return bsnTlvIpv6DstVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIpv6DstVer14Funnel FUNNEL = new OFBsnTlvIpv6DstVer14Funnel();
    static class OFBsnTlvIpv6DstVer14Funnel implements Funnel<OFBsnTlvIpv6DstVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIpv6DstVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x7f
            sink.putShort((short) 0x7f);
            // fixed value property length = 20
            sink.putShort((short) 0x14);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIpv6DstVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIpv6DstVer14 message) {
            // fixed value property type = 0x7f
            bb.writeShort((short) 0x7f);
            // fixed value property length = 20
            bb.writeShort((short) 0x14);
            message.value.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIpv6DstVer14(");
        b.append("value=").append(value);
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
        OFBsnTlvIpv6DstVer14 other = (OFBsnTlvIpv6DstVer14) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
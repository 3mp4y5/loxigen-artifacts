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

class OFOxmIpv6DstVer15 implements OFOxmIpv6Dst {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpv6DstVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 20;

        private final static IPv6Address DEFAULT_VALUE = IPv6Address.NONE;

    // OF message fields
    private final IPv6Address value;
//
    // Immutable default instance
    final static OFOxmIpv6DstVer15 DEFAULT = new OFOxmIpv6DstVer15(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpv6DstVer15(IPv6Address value) {
        if(value == null) {
            throw new NullPointerException("OFOxmIpv6DstVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003610L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_DST;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<IPv6Address> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public IPv6Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFOxmIpv6Dst.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpv6Dst.Builder {
        final OFOxmIpv6DstVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv6Address value;

        BuilderWithParent(OFOxmIpv6DstVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003610L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6Dst.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_DST;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv6Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public IPv6Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFOxmIpv6Dst build() {
                IPv6Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmIpv6DstVer15(
                    value
                );
        }

    }

    static class Builder implements OFOxmIpv6Dst.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv6Address value;

    @Override
    public long getTypeLen() {
        return 0x80003610L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6Dst.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_DST;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv6Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public IPv6Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFOxmIpv6Dst build() {
            IPv6Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmIpv6DstVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpv6Dst> {
        @Override
        public OFOxmIpv6Dst readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80003610L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003610)
                throw new OFParseError("Wrong typeLen: Expected=0x80003610L(0x80003610L), got="+typeLen);
            IPv6Address value = IPv6Address.read16Bytes(bb);

            OFOxmIpv6DstVer15 oxmIpv6DstVer15 = new OFOxmIpv6DstVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpv6DstVer15);
            return oxmIpv6DstVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpv6DstVer15Funnel FUNNEL = new OFOxmIpv6DstVer15Funnel();
    static class OFOxmIpv6DstVer15Funnel implements Funnel<OFOxmIpv6DstVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpv6DstVer15 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003610L
            sink.putInt((int) 0x80003610);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpv6DstVer15> {
        @Override
        public void write(ByteBuf bb, OFOxmIpv6DstVer15 message) {
            // fixed value property typeLen = 0x80003610L
            bb.writeInt((int) 0x80003610);
            message.value.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpv6DstVer15(");
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
        OFOxmIpv6DstVer15 other = (OFOxmIpv6DstVer15) obj;

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
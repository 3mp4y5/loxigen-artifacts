// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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

class OFOxmIpEcnVer12 implements OFOxmIpEcn {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpEcnVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 5;

        private final static IpEcn DEFAULT_VALUE = IpEcn.NONE;

    // OF message fields
    private final IpEcn value;
//
    // Immutable default instance
    final static OFOxmIpEcnVer12 DEFAULT = new OFOxmIpEcnVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpEcnVer12(IpEcn value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80001201L;
    }

    @Override
    public IpEcn getValue() {
        return value;
    }

    @Override
    public MatchField<IpEcn> getMatchField() {
        return MatchField.IP_ECN;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<IpEcn> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public IpEcn getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmIpEcn.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpEcn.Builder {
        final OFOxmIpEcnVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IpEcn value;

        BuilderWithParent(OFOxmIpEcnVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80001201L;
    }

    @Override
    public IpEcn getValue() {
        return value;
    }

    @Override
    public OFOxmIpEcn.Builder setValue(IpEcn value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IpEcn> getMatchField() {
        return MatchField.IP_ECN;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IpEcn> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public IpEcn getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmIpEcn build() {
                IpEcn value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmIpEcnVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmIpEcn.Builder {
        // OF message fields
        private boolean valueSet;
        private IpEcn value;

    @Override
    public long getTypeLen() {
        return 0x80001201L;
    }

    @Override
    public IpEcn getValue() {
        return value;
    }

    @Override
    public OFOxmIpEcn.Builder setValue(IpEcn value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IpEcn> getMatchField() {
        return MatchField.IP_ECN;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IpEcn> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public IpEcn getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmIpEcn build() {
            IpEcn value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmIpEcnVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpEcn> {
        @Override
        public OFOxmIpEcn readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80001201L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80001201)
                throw new OFParseError("Wrong typeLen: Expected=0x80001201L(0x80001201L), got="+typeLen);
            IpEcn value = IpEcn.readByte(bb);

            OFOxmIpEcnVer12 oxmIpEcnVer12 = new OFOxmIpEcnVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpEcnVer12);
            return oxmIpEcnVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpEcnVer12Funnel FUNNEL = new OFOxmIpEcnVer12Funnel();
    static class OFOxmIpEcnVer12Funnel implements Funnel<OFOxmIpEcnVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpEcnVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80001201L
            sink.putInt((int) 0x80001201);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpEcnVer12> {
        @Override
        public void write(ChannelBuffer bb, OFOxmIpEcnVer12 message) {
            // fixed value property typeLen = 0x80001201L
            bb.writeInt((int) 0x80001201);
            message.value.writeByte(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpEcnVer12(");
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
        OFOxmIpEcnVer12 other = (OFOxmIpEcnVer12) obj;

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

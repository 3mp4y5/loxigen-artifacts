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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionIdSetMplsTtlVer15 implements OFActionIdSetMplsTtl {
    private static final Logger logger = LoggerFactory.getLogger(OFActionIdSetMplsTtlVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 4;


    // OF message fields
//
    // Immutable default instance
    final static OFActionIdSetMplsTtlVer15 DEFAULT = new OFActionIdSetMplsTtlVer15(

    );

    final static OFActionIdSetMplsTtlVer15 INSTANCE = new OFActionIdSetMplsTtlVer15();
    // private empty constructor - use shared instance!
    private OFActionIdSetMplsTtlVer15() {
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_MPLS_TTL;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    // no data members - do not support builder
    public OFActionIdSetMplsTtl.Builder createBuilder() {
        throw new UnsupportedOperationException("OFActionIdSetMplsTtlVer15 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionIdSetMplsTtl> {
        @Override
        public OFActionIdSetMplsTtl readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 15
            short type = bb.readShort();
            if(type != (short) 0xf)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_MPLS_TTL(15), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 4)
                throw new OFParseError("Wrong length: Expected=4(4), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionIdSetMplsTtlVer15Funnel FUNNEL = new OFActionIdSetMplsTtlVer15Funnel();
    static class OFActionIdSetMplsTtlVer15Funnel implements Funnel<OFActionIdSetMplsTtlVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionIdSetMplsTtlVer15 message, PrimitiveSink sink) {
            // fixed value property type = 15
            sink.putShort((short) 0xf);
            // fixed value property length = 4
            sink.putShort((short) 0x4);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionIdSetMplsTtlVer15> {
        @Override
        public void write(ByteBuf bb, OFActionIdSetMplsTtlVer15 message) {
            // fixed value property type = 15
            bb.writeShort((short) 0xf);
            // fixed value property length = 4
            bb.writeShort((short) 0x4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionIdSetMplsTtlVer15(");
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        return result;
    }

}
